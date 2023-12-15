package com.hspedu.interface_;

public class MysqlDB implements  DBInterface {
    @Override
    public void connect() {
        System.out.println("链接myysql");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql");
    }
}
