package com.qqserver.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class QQServer {

    private ServerSocket ss = null;
    //创建一个集合，存放多个用户，如果是这些用户登录，就认为是合法
    private static HashMap<String ,User> validUsers = new HashMap<>();

    static { // 在静态代码块，初始化 用户
        validUsers.put("100",new User("100","123456"));
        validUsers.put("200",new User("200","123456"));
        validUsers.put("300",new User("300","123456"));
        validUsers.put("王宝强",new User("王宝强","123456"));
        validUsers.put("张三",new User("张三","123456"));
        validUsers.put("谢飞机",new User("谢飞机","123456"));
    }

    // 验证用户是否有效的方法
    private boolean checkUser(String userId,String passwd){
        User user = validUsers.get(userId);
        if (user==null){  //  说明userId没有存在 validUsers 的key中
            return false;
        }
        if (!user.getPasswd().equals(passwd)){ // userId正确，但是密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        //端口可以写在配置文件里
        try {
            System.out.println("服务端在9999端口监听。。。");
            //启动推送新闻的线程
            new Thread(new SendNewsToAllService()).start();
            ss = new ServerSocket(9999);

            while (true) { //当和某个客户端连接后，会继续监听，因此while
                Socket socket = ss.accept();
                //得到socket关联的对象输入流
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                //得到socket关联的对象输出流
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                User u = (User) ois.readObject();// 读取客户端发送的User对象
                //创建一个Message对象，准备回复客户端
                Message message = new Message();
                //验证
                if (checkUser(u.getUserId(), u.getPasswd())) { //登录通过
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将message对象回复客户端
                    oos.writeObject(message);
                    // 将message对象回复客户端
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, u.getUserId());
                    //启动该线程
                    serverConnectClientThread.start();
                    //把线程对象，放入到一个集合中，进行管理
                    ManagerClientThreads.addClientThreads(u.getUserId(), serverConnectClientThread);

                } else {//登录失败
                    System.out.println("用户 id="+u.getUserId()+"pwd= "+u.getPasswd()+"验证失败。。。");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //如果服务器退出了while，说明服务器不在监听，因此关闭 ServerSocket
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



