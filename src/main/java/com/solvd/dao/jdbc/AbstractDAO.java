package com.solvd.dao.jdbc;

import com.solvd.ConnectionPool;
import com.solvd.dao.BaseDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class AbstractDAO<T> implements BaseDAO<T> {
    protected Connection connection;

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }

    protected Connection getConnection() throws SQLException {
        return ConnectionPool.getConnection();
    }

    protected PreparedStatement prepareStatement(Connection connection, String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }
}