package com.hsp.jdbc.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCUtils {
    private static String users;
    private static String password;
    private static String url;
    private static String driver;

    static {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src\\mysql.properties"));
            users = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
     public static Connection getConnection() {
         try {
             return DriverManager.getConnection(url,users,password);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
     public static void close(ResultSet set, Statement statement,Connection connection) {
        //判断是否为空
         try {
             if(set != null){
                 set.close();
             }
             if(statement != null){
                 statement.close();
             }
             if(connection != null){
                 connection.close();
             }
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }


}
