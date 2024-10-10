package com.solvd;

import com.solvd.dao.jdbc.EmployeeDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class DBTest {
    public static void main(String[] args) {
        try (Connection connection = ConnectionPool.getConnection()) {
            if (connection != null) {
                System.out.println("Connection successful!");

                // Create DAO instance with the connection
                EmployeeDAO employeeDAO = new EmployeeDAO(connection);

                // Retrieve employees
                System.out.println("Employees in the database:");
                employeeDAO.getEntities().forEach(employee -> {
                    System.out.println(employee.getFullName());
                });

            } else {
                System.out.println("Failed to make connection!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}