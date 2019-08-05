package test;

import org.junit.Before;
import org.junit.Test;

import java.sql.*;

public class Jdbc {
    String urlString = "jdbc:postgresql://room-reservation-qa.cxvqfpt4mc2y.us-east-1.rds.amazonaws." +
            "com:5432/hr";
    String username = "hr";
    String password = "hr";

    @Before
    public void setup()throws SQLException, ClassNotFoundException{
        //when we are working with more then one data base we need to specify
        Class.forName("org.postgresql.Driver");

    }
    @Test
    public void jdbcTest() throws SQLException {
        Connection connection = DriverManager.getConnection(urlString, username, password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet resultSet = statement.executeQuery("select * from employees;");
        //we need to skip first record because it start from 0
        resultSet.next();
        System.out.println(resultSet.getString("first_name"));
        int count = 0;
        //next() returns boolean if there is no next row
        while (resultSet.next()){
            count++;
            System.out.println(count + resultSet.getString("first_name"));
        }
        // resultSet metadata
        ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
        int column = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= resultSetMetaData.getColumnCount();i++ ){
            System.out.println(resultSetMetaData.getColumnName(i));
        }

        //to use metadata (info about the database)
        DatabaseMetaData dbMeta = connection.getMetaData();
        System.out.println(dbMeta.getUserName());
        System.out.println(dbMeta.getURL());


        //to go to last row
        resultSet.last();
        int actual = resultSet.getRow();
        System.out.println(actual);

        //to output data types of employees table
        int numOfColumns = resultSetMetaData.getColumnCount();
        for (int i = 1; i <= numOfColumns; i++){
            System.out.println(resultSetMetaData.getColumnTypeName(i));
        }
    }
}

