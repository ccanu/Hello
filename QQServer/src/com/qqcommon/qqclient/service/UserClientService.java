package com.qqcommon.qqclient.service;

import com.qqcommon.Message;
import com.qqcommon.MessageType;
import com.qqcommon.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientService {
    boolean b = false;
    private User u;
    private Socket socket;
    //根据userId 和 pwd 到服务器验证该用户是否合法

    public boolean checkUser(String userId,String pwd) {
        boolean b = false;
        //创建user对象
        u.setUserId(userId);
        u.setPasswd(pwd);
        try {
            socket = new Socket(InetAddress.getByName("192.168.1.13"),9999);
            //得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送user对象

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message)ois.readObject();
            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {

                b= true;
                //创建一个和服务器端保持通信的线程-> 创建一个类 ClientConnectServerThread

                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                //启动客户端的线程
                clientConnectServerThread.start();
                //把线程对象，放入到一个集合中，进行管理

            }else {//如果登录失败，我们就不能启动和服务器通信的线程，关闭socket
                socket.close();

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return b;

    }
    // 向服务端请求在线用户列表
    public void onlineFriendList(){
        //发送一个 Message,类型是 MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        //发送给服务器
        try {
            //从管理线程的集合中，通过userId,得到这个线程
            ClientConnectServerThread clientConnectServerThread = ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
            //通过这个线程得到关联的socket
            Socket socket = clientConnectServerThread.getSocket();
            //得到当前线程的Socket 对应的 ObjectOutputStream 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message);// 发送一个Message对象，向服务端要求在线用户列表
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 编写方法，退出客户端，并给服务端发送一个退出系统的message对象
    public void logout(){
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId()); //指定哪个客户端id

//        发送message
        try {
//            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId()+" 退出了系统");
            System.exit(0);// 结束进程
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


