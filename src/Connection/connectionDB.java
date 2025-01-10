package Connection;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/laundry";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";

    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        return connection;
    }

    public static void main(String[] args) {
        connect(); // Test koneksi
    }
}
