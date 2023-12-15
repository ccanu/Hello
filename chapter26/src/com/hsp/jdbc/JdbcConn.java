package com.hsp.jdbc;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class JdbcConn {
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Object o = aClass.newInstance();
    }




    }

