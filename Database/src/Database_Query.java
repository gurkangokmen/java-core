import java.sql.*;
import java.util.ArrayList;

public class Database_Query {
    public static void main(String[] args) throws SQLException
    {
        //Do_Query("SELECT * FROM `hotel-management-system`.bookingdetails;");
        //Add_Database("Insert Into `hotel-management-system`.bookingdetails (Booking_Id,StartDate,EndDate,Amount,Period) values(5,'2022-11-11','2022-11-11',5,5)");
        //Update_Database("Update `hotel-management-system`.bookingdetails  set Amount=6 where Booking_Id=4");
        Delete_Database("delete from `hotel-management-system`.bookingdetails where Booking_Id=1");
    }



    public static void Do_Query(String query) throws SQLException
    {
        /**
         * It prints results for query string.
         *
         * Parameters:
         *              String query
         */
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        Database_Connection connection_helper = new Database_Connection();
        connection = connection_helper.get_connection();
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);
        ArrayList<HotelManagementSystem> informations_of_hotel_management_system = new ArrayList<HotelManagementSystem >();

        while (resultSet.next())
        {
            informations_of_hotel_management_system.add(new HotelManagementSystem(resultSet.getInt("Booking_Id"),resultSet.getString("StartDate"),resultSet.getString("EndDate"),resultSet.getInt("Amount"),resultSet.getInt("Period")));
            //System.out.println(resultSet.getString("Booking_Id"));
        }
        System.out.println(informations_of_hotel_management_system.size());

        statement.close();
        connection.close();
    }

    public static void Add_Database(String query) throws SQLException
    {
        Connection connection = null;
        PreparedStatement statement = null;




        Database_Connection connection_helper = new Database_Connection();
        connection = connection_helper.get_connection();
        statement = connection.prepareStatement(query);

        int result = statement.executeUpdate();
        System.out.println("Kayıt eklendi.");

        statement.close();
        connection.close();


    }

    public static void Update_Database(String query) throws SQLException
    {
        Connection connection = null;
        PreparedStatement statement = null;

        Database_Connection connection_helper = new Database_Connection();
        connection = connection_helper.get_connection();
        statement = connection.prepareStatement(query);
        int result = statement.executeUpdate();
        System.out.println("Kayıt güncellendi.");

        statement.close();
        connection.close();
    }

    public static void Delete_Database(String query) throws SQLException
    {
        Connection connection = null;
        PreparedStatement statement = null;

        Database_Connection connection_helper = new Database_Connection();
        connection = connection_helper.get_connection();
        statement = connection.prepareStatement(query);
        int result = statement.executeUpdate();
        System.out.println("Kayıt silindi.");

        statement.close();
        connection.close();

    }
}
