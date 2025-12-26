package demo;

import java.sql.SQLException;

public class Demo {

    public static void main(String[] args) {
        try {
            addStudent("Asia");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void addStudent(String name) throws SQLException {
        try {
            saveToDatabase(name);
            System.out.println("Name " + name + " is added.");
        } catch (Exception e) {
            throw new SQLException("Fail to add student to database.", e);
        }
    }

    private static void saveToDatabase(String name) throws SQLException {
        throw new SQLException("Simulated DB failure for: " + name);
    }
}
