import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;

public class DeleteFromDatabase {
    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3307/aakanksha";
        String databseUserName = "aakanksha";
        String databasePassword = "abcd1234";
        Connection con = null;
        String sql = "DELETE FROM USER WHERE place='Punjab'";
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            Statement stmt = con.createStatement();

                stmt.executeUpdate(sql);
                System.out.println("Record deleted successfully");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}