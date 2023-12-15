package com.hsp.jdbc.PreparedStatement_;

import javax.xml.transform.Result;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;
@SuppressWarnings({"all"})
public class PreparedStatement_ {

        public static void main(String[] args) throws Exception{
            //看类图
            Scanner scanner = new Scanner(System.in);
            //让用户输入管理员名和密码
            System.out.print("请输入管理员的名字:");//next 接收到 空格就结束
            String admin_name = scanner.nextLine();//如果希望看到sql注入，则这里需要使用nextLine
            System.out.print("请输入管理员的密码:");
            String admin_pwd = scanner.nextLine();
            //通过properties获取配置文件的信息
            Properties properties = new Properties();
            properties.load(new FileInputStream("D:\\idea学习\\javaweb\\jdbc\\day01\\src\\mysql.properties"));
            //获取相关的值
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            String driver = properties.getProperty("driver");
            String url = properties.getProperty("url");
            //1.注册驱动
            Class.forName(driver);
            //2.得到连接
            Connection connection = DriverManager.getConnection(url, user, password);

            //3.得到PreparedStatement
            //3.1 组织一个sql语句 ?：相当于占位符
            String sql = "select name ,pwd from admin where NAME =? and pwd =?";
            //3.2 preparedStatement 实现了 PreparedStatement 接口的一个实现类的对象
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            //3.3 给? 赋值
            preparedStatement.setString(1,admin_name);
            preparedStatement.setString(2,admin_pwd);
            //4.执行
            // 这里执行 executeQuery ，不要写sql，之前已经赋值
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){  //查询到一条记录，则说明该管理存在
                System.out.println("成功");
            }else {
                System.out.println("失败");
            }
            resultSet.close();
            preparedStatement.close();
            connection.close();
        }
    }


