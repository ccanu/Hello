package com.hsp.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
        //1.注册驱动
        Driver driver = new com.mysql.jdbc.Driver();
        //2.得到连接
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        //将用户名密码放入Properties对象
        Properties properties = new Properties();
        properties.setProperty("user","root");//用户
        properties.setProperty("password","hps");//密码
        Connection connect = driver.connect(url,properties);
        //执行sql
        String sql = "insert into actor values(null,'灿宇','男','1970-11-11','2131')";
        //statement 用于执行静态SQL语句并返回其生成的结果的对象
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);
        //关闭
        statement.close();
        connect.close();
    }


}
