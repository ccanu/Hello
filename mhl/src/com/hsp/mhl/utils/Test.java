package com.hsp.mhl.utils;

import java.sql.Connection;

public class Test {
    public static void main(String[] args) {
        System.out.println("输入一个整数");
        int i = Utility.readInt();
        System.out.println("i=" + i);
        Connection connection = DruidUtils.getConnection();
        System.out.println(connection.getClass());
        DruidUtils.close(null, null, connection);

    }
}
