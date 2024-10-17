package com.solvd.dao.jdbc;

import com.solvd.model.Employee;
import com.solvd.model.Manager;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ManagerDAO extends EmployeeDAO {

    public ManagerDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Manager getEntityById(int id) {
        String query = "SELECT * FROM employees WHERE employee_id = ? AND role_id = ?";  // Assuming role_id corresponds to Manager
        Manager manager = null;
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, id);
            ps.setInt(2, 1);  // Assuming role_id 1 corresponds to Manager
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                manager = new Manager(
                        rs.getInt("employee_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("department_id"),
                        rs.getInt("role_id"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getDouble("salary"),
                        rs.getInt("team_size"),  // Assuming you store team size
                        rs.getString("department_managed")  // Assuming you store department managed
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return manager;
    }

    @Override
    public List<Employee> getEntities() {
        List<Employee> managers = new ArrayList<>();
        String query = "SELECT * FROM employees WHERE role_id = ?";  // Assuming role_id corresponds to Manager
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, 1);  // Assuming role_id 1 corresponds to Manager
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Manager manager = new Manager(
                        rs.getInt("employee_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("department_id"),
                        rs.getInt("role_id"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getDouble("salary"),
                        rs.getInt("team_size"),
                        rs.getString("department_managed")
                );
                managers.add(manager);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return managers;
    }
}