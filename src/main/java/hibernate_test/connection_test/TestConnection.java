package hibernate_test.connection_test;

import java.sql.*;

public class TestConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";

        String user = "bestuser";
        String password = "bestuser";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connection successful!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
