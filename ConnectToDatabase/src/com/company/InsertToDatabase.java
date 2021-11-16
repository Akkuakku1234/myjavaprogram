import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;

public class InsertToDatabase {
    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3307/aakanksha";
        String databseUserName = "aakanksha";
        String databasePassword = "abcd1234";
        Connection con = null;
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            Statement stmt = con.createStatement();
            int result = stmt.executeUpdate("INSERT INTO USER(Name,Email,Age,Place) VALUES('insert','insert@gmail.com',50,'MP'),('ab','ab@gmail.com',51,'Bhopal')");

           if(result>0)
                System.out.println("successfully inserted");
           else
               System.out.println("unsuccessfull");
           con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}