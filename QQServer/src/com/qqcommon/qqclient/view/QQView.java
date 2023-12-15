package com.qqcommon.qqclient.view;

import com.qqcommon.qqclient.service.FileClientService;
import com.qqcommon.qqclient.service.MessageClientService;
import com.qqcommon.qqclient.service.UserClientService;
import com.qqcommon.qqclient.utils.Utility;

public class QQView {
    private boolean loop = true;// 控制是否显示菜单那
    private String key = ""; // 接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();// 对象是用于登录/注册用户
    private MessageClientService messageClientService = new MessageClientService();//对象用户私聊/群聊
    private FileClientService fileClientService = new FileClientService();


    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("退出客户端。。。");
    }

    //显示主菜单
    public void mainMenu() {

        while (loop) {
            System.out.println("==========欢迎登录网络通信系统===========");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择：");
            key = Utility.readString(1);

            //根据用户的输入，来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.print("请输入用户名：");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密  码：");
                    String passwd = Utility.readString(50);
                    // 到服务器验证该用户是否合法
                    if (userClientService.checkUser(userId, passwd)) {
                        System.out.println("==========欢迎(用户 " + userId + ") 登录成功 ===========");
                        //进入二级菜单
                        while (loop) {
                            System.out.println("\n==========网络通信系统二级菜单(用户" + userId + " )===========");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择：");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("请输入相对大家说的话：");
                                    String s = Utility.readString(50);
                                    //调用一个方法，把消息封装成message对象，发送给服务端
                                    messageClientService.send(s,userId);
                                    break;
                                case "3":
                                    System.out.println("请输入想聊天的用户号（在线）: ");
                                    String getterId = Utility.readString(50);
                                    System.out.println("请输入想说的话: ");
                                    String content = Utility.readString(50);
                                    //编写一个方法，将消息发送给服务端
                                    messageClientService.sendMessageToOne(content,userId,getterId);
                                    break;
                                case "4":
                                    System.out.println("请输入你想把文件发送给的用户(在线用户)：");
                                    getterId=Utility.readString(50);
                                    System.out.println("请输入发送文件的路径(形式 d:\\xx.jpg)");
                                    String src = Utility.readString(100);
                                    System.out.println("请输入把文件发送到对应的路径(d:\\yy.jsp)");
                                    String dest = Utility.readString(100);

                                   fileClientService.sendFileToOne(src,dest,userId,getterId);
                                    break;
                                case "9":
                                    // 调用方法，给服务端发送一个退出系统的message
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }
                    } else {
                        System.out.println("==========登录失败==========");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
