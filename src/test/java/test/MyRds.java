package test;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import utilities.DButil;

import java.sql.SQLException;

public class MyRds {

    @Before
    public void setup() throws SQLException, ClassNotFoundException {
        //when we are working with more then one data base we need to specify
        Class.forName("org.postgresql.Driver");
        String urlString = "jdbc:postgresql://database-1.cu3tdunz18sp.us-east-2.rds.amazonaws.com:5432/hr";
        String username = "sdetuser";
        String password = "sdetuser12345";
        DButil.creatConnnection(urlString,username,password);
    }
    @Ignore
    @Test
    public void jdbcTest() throws SQLException {
        String query = "UPDATE students SET course_id = '47' WHERE student_id = 44";
        DButil.executeQuery(query);
    }

    @Test
    public void test(){
        String query = "INSERT INTO students VALUES('10','someName', '23')";
        DButil.executeQuery(query);
    }
}