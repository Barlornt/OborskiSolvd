package com.solvd.dao.jdbc;

import com.solvd.model.Role;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO extends AbstractDAO<Role> {

    public RoleDAO(Connection connection) {
        super(connection);
    }

    @Override
    public Role getEntityById(int id) {
        String query = "SELECT * FROM roles WHERE role_id = ?";
        Role role = null;
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                role = new Role(
                        rs.getInt("role_id"),
                        rs.getString("role_name"),
                        rs.getInt("department_id")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

    @Override
    public List<Role> getEntities() {
        List<Role> roles = new ArrayList<>();
        String query = "SELECT * FROM roles";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role(
                        rs.getInt("role_id"),
                        rs.getString("role_name"),
                        rs.getInt("department_id")
                );
                roles.add(role);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;
    }

    @Override
    public void insert(Role role) {
        String query = "INSERT INTO roles (role_name, department_id) VALUES (?, ?)";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setString(1, role.getRoleName());
            ps.setInt(2, role.getDepartmentId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM roles WHERE role_id = ?";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, Role role) {
        String query = "UPDATE roles SET role_name = ?, department_id = ? WHERE role_id = ?";
        try (Connection connection = getConnection(); PreparedStatement ps = prepareStatement(connection, query)) {
            ps.setString(1, role.getRoleName());
            ps.setInt(2, role.getDepartmentId());
            ps.setInt(3, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}