/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mysql;

/**
 *
 * @author L340
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MYSQL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        // JDBC URL, username, and password of MySQL server
        String jdbcUrl = "jdbc:mysql://your_database_url:3306/db_kampus";
        String username = "root";
        String password = "";

        try {
            // Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Open a connection
            System.out.println("Connecting to database...");
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);

            // Do something with the connection (e.g., execute SQL queries)

            // Close the connection
            connection.close();
            System.out.println("Connection closed.");
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC driver not found");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the database");
            e.printStackTrace();
        }
    }
}
