package com.solvd.dao.jdbc;

import com.solvd.model.Employee;
import com.solvd.model.Role;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends AbstractDAO<Employee> {

    public EmployeeDAO(Connection connection) {
        super(connection);
    }
    @Override
    public Employee getEntityById(int id) {
        String query = "SELECT * FROM employees WHERE employee_id = ?";
        Employee employee = null;
        List<Role> roles = new ArrayList<>();

        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employee = new Employee(
                        rs.getInt("employee_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("department_id"),
                        rs.getInt("role_id"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getDouble("salary"),
                        roles
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> getEntities() {
        List<Employee> employees = new ArrayList<>();
        String query = "SELECT * FROM employees";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("employee_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("department_id"),
                        rs.getInt("role_id"),
                        rs.getDate("hire_date").toLocalDate(),
                        rs.getDouble("salary"),
                        new ArrayList<>()
                );
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public void insert(Employee employee) {
        String query = "INSERT INTO employees (first_name, last_name, department_id, hire_date, role_id, salary) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setInt(3, employee.getDepartmentId());
            ps.setDate(4, Date.valueOf(employee.getHireDate()));
            ps.setInt(5, employee.getRoleId());
            ps.setDouble(6, employee.getSalary());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM employees WHERE employee_id = ?";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, Employee employee) {
        String query = "UPDATE employees SET first_name = ?, last_name = ?, department_id = ?, hire_date = ?, role_id = ?, salary = ? WHERE employee_id = ?";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setString(1, employee.getFirstName());
            ps.setString(2, employee.getLastName());
            ps.setInt(3, employee.getDepartmentId());
            ps.setDate(4, Date.valueOf(employee.getHireDate()));
            ps.setInt(5, employee.getRoleId());
            ps.setDouble(6, employee.getSalary());
            ps.setInt(7, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

