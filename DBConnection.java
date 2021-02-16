package models;

import java.sql.*;

public class DBConnection {
    private String url;
    private String username;
    private String password;
    private Connection connect;

    public DBConnection(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }

    public void openConnect() throws Exception {
        connect = DriverManager.getConnection(url, username, password);
    }

    public void closeConnect() throws Exception {
        connect.close();
    }

    public void init() {
        System.out.println("Set Init DBConnection\n");
        try {
            openConnect();
        } catch (Exception ex) {
            System.out.println("Connection failed!");
            System.out.println(ex);
        }
    }

    public void destroy() {
        System.out.println("\nWas destroy DBConnection");
        try {
            closeConnect();
        } catch (Exception ex) {
            System.out.println("Closing failed!");
            System.out.println(ex);
        }
    }

    public ResultSet getData(String sql) {
        ResultSet resultSet = null;

        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException sqlEx) {
            System.out.println("SQL query failed!");
            System.out.println(sqlEx);
        }
        return resultSet;
    }

    public void updateData(String sql) {
        try {
            PreparedStatement preparedStatement = connect.prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException sqlEx) {
            System.out.println("Date update failed!");
            System.out.println(sqlEx);
        }
    }
}
