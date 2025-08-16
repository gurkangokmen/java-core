import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database_Connection {

    public static void main(String[] args) throws SQLException {
        String username = "root";
        String password = "123Güvercin123";
        String dbUrl = "jdbc:mysql://localhost:3306/hotel-management-system";

        Connection connection = null;



        try
        {
            connection = DriverManager.getConnection(dbUrl,username,password);
            System.out.println("Bağlantı Oluştu.");

        }
        catch (SQLException exception)
        {
            System.out.println(exception.getMessage());
        }

        finally {
            connection.close();
        }

    }

    public static Connection get_connection() throws SQLException
    {
        /**
         * It returns connection for database
         *
         * Parameters:
         *              None
         */

        String username = "root";
        String password = "123Güvercin123";
        String dbUrl = "jdbc:mysql://localhost:3306/hotel-management-system";

        return DriverManager.getConnection(dbUrl,username,password);
    }

    public static void show_error_message(SQLException exception)
    {
        /**
         * It returns error message and error code in while connection for database
         *
         * Parameters:
         *              None
         */

        System.out.println("Error:"+exception.getMessage());
        System.out.println("Error code:"+exception.getErrorCode());
    }

}