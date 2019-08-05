package utilities;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DButil {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;
    //--------------------------------------------------------------------------------------------
    public static void creatConnnection(String url, String userName, String password) {
        try {
            connection = DriverManager.getConnection(url, userName, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //------------------------------------------------------------------------------------
    public static void destroy() {
        try {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    //---------------------------------------------------------------------------------
    public static void executeQuery(String query){
        try{
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            resultSet = statement.executeQuery(query);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    //------------------------------------------------------------
    public static int getRowCount(){
        int amountofRow = 0;
        try {
            resultSet.last();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return amountofRow;
    }
    //---------------------------------------------------------
    public static List<String> getColumnNames(String query){
        List<String> columns = new ArrayList<>();
        try {
            executeQuery(query);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            int colimnCount = rsmd.getColumnCount();
            for (int i = 1; i <= colimnCount; i++) {
                columns.add(rsmd.getColumnName(i));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return columns;

    }
    //----------------------------------------------------------------------------------------
    public static List<String> executeQueryAndGetColumnValue(String query, String columnName){
        executeQuery(query);
        List<String> values = new ArrayList<>();

        try{
            ResultSetMetaData rdmd = resultSet.getMetaData();
            while (resultSet.next()){
                values.add(resultSet.getString(columnName));
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return values;
    }
    //-------------------------------------------------------------------------------
    public static List<Map<String, Object>> getQueryResultMap(String query) {
        executeQuery(query);
        List<Map<String, Object>> rowList = new ArrayList<>();
        ResultSetMetaData rsmd;
        try {
            rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                Map<String, Object> colNameValueMap = new HashMap<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    colNameValueMap.put(rsmd.getColumnName(i), resultSet.getObject(i));
                }
                rowList.add(colNameValueMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rowList;

    }
}

