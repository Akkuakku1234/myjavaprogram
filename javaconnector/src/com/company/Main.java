import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class ConnectToDatabase {
    public static void main(String[] args) {
        String MySQLURL = "jdbc:mysql://localhost:3306/web?useSSL=false";
        String databseUserName = "root";
        String databasePassword = "123456";
        Connection con = null;
        try {
            con = DriverManager.getConnection(MySQLURL, databseUserName, databasePassword);
            if (con != null) {
                System.out.println("Database connection is successful !!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
