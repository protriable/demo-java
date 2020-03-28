/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2020 All Rights Reserved.
 */
package com.protry.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author shaobin
 * @version : JDBCExample.java, v 0.1 2020年03月15日 9:15 下午 shaobin Exp $
 */
public class JDBCExample {

    private Connection connection() {
        Connection connection;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mybatis?zeroDateTimeBehavior=convertToNull";
            String user = "root";
            String password = "root";
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException|SQLException e) {
            e.printStackTrace();
            return null;
        }
        return connection;
    }
}