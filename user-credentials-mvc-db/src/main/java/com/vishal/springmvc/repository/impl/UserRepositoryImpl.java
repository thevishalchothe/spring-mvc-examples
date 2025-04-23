package com.vishal.springmvc.repository;

import com.vishal.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private DataSource dataSource;

    // Save user to the database using PreparedStatement
    @Override
    public void save(User user) {
        String sql = "INSERT INTO user (uname, username, password, email, mobileNumber) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DataSourceUtils.getConnection(dataSource);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, user.getUname());
            statement.setString(2, user.getUsername());
            statement.setString(3, user.getPassword());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getMobileNumber());

            int rowsAffected = statement.executeUpdate(); // Execute the insert query

            if (rowsAffected == 0) {
                throw new SQLException("No rows were inserted, user registration failed.");
            }

        } catch (SQLException e) {
            // Log and rethrow as a runtime exception with a more informative message
            throw new RuntimeException("Error saving user to the database: " + e.getMessage(), e);
        }
    }

    // Find user by username and password for login
    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";

        try (Connection connection = DataSourceUtils.getConnection(dataSource);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return new User(
                        resultSet.getInt("uid"),
                        resultSet.getString("uname"),
                        resultSet.getString("username"),
                        resultSet.getString("password"),
                        resultSet.getString("email"),
                        resultSet.getString("mobileNumber")
                );
            }

        } catch (SQLException e) {
            // Log and rethrow as a runtime exception with a more informative message
            throw new RuntimeException("Error fetching user from database: " + e.getMessage(), e);
        }

        return null; // Return null if no user is found
    }

    // Optional: Check if username already exists (for registration validation)
    public boolean existsByUsername(String username) {
        String sql = "SELECT COUNT(*) FROM user WHERE username = ?";

        try (Connection connection = DataSourceUtils.getConnection(dataSource);
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, username);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return resultSet.getInt(1) > 0; // If count > 0, username exists
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error checking if username exists: " + e.getMessage(), e);
        }

        return false; // Return false if no such username exists
    }
}
