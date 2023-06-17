package com.example;

/**
 * Hello world!
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/northwind";
        String username = "root2323";
        String password = "32";

        try {
            // Tạo kết nối tới cơ sở dữ liệu
            Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
                        Connection connection = DriverManager.getConnection(jdbcUrl, username, password);


            // Tạo một câu lệnh SQL


            String sql = "SELECT * FROM huyhandsomefff";


            // Tạo đối tượng Statement để thực thi câu lệnh SQL
            Statement statement = connection.createStatement();

            // Thực thi câu lệnh SQL và nhận kết quả
            ResultSet resultSet = statement.executeQuery(sql);

            // Xử lý kết quả
            while (resultSet.next()) {
                String customerId = resultSet.getString("custom23erId");
                String customerName = resultSet.getString("name");
                System.out.println("Customer ID: " + customerId + ", Customer Name: " + customerName);
            }

            // Đóng kết nối và giải phóng tài nguyên
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

