import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.sql.*;

public class SelectFromDatabase {
    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3307/aakanksha";
        String databseUserName = "aakanksha";
        String databasePassword = "abcd1234";
        Connection con = null;
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE Name LIKE 'a%'");
            while(rs.next())
            {
                String name = rs.getString("name");
                System.out.println(name);
                String Email = rs.getString("Email");
                System.out.println(Email);
                String Age = rs.getString("Age");
                System.out.println(Age);
                String Place = rs.getString("Place");
                System.out.println(Place);

            }
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
