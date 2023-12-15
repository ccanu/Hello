package com.hsp.jdbc.mujdbc;

public class OracleJdbcImpl  implements JdbcInterface{
    @Override
    public Object getConnection() {
        System.out.println("得到 oracle的连接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成对oracle的增删改查");

    }

    @Override
    public void close() {
        System.out.println("关闭oracle的连接");

    }
}
