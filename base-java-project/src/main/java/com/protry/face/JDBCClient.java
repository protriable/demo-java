package com.protry.face;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class JDBCClient {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC";
    static final String USER = "root";
    static final String PASSWORD = "root";
    public static void main(String[] args) {
        Connection connection = null;
        try {
            //1.加载驱动
            Class.forName(JDBC_DRIVER);
            //2.创建连接
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            //3.创建语句
            final PreparedStatement preparedStatement = connection.prepareStatement("select * from t_user where name=? and address=?");
            preparedStatement.setString(1,"a");
            preparedStatement.setString(2, "b");
            //4.执行语句
            final ResultSet resultSet = preparedStatement.executeQuery();
            //5.处理结果
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name")
                        + " - " + resultSet.getString("address"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            //6.关闭资源
            if (null != connection) {
                try {
                    if (!connection.isClosed()) {
                        connection.close();
                    }
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

}
