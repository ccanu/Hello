package com.qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

public class ManagerClientThreads {
    private static HashMap<String,ServerConnectClientThread> hm=new HashMap<>();

    public static HashMap<String, ServerConnectClientThread> getHm() {
        return hm;
    }

    //添加线程对象到 hm集合
    public static void addClientThreads(String userId,ServerConnectClientThread serverConnectClientThread){
        hm.put(userId,serverConnectClientThread);
    }

    // 根据userId 返回 ServerConnectClientThread 线程
    public static ServerConnectClientThread getServerConnectClientThread(String userId){
        return hm.get(userId);
    }

    //从集合中，移除某个线程对象
    public static void remoServerConnectClientThread(String userId){
        hm.remove(userId);
    }
    // 这里编写方法，可以返回在线用户列表
    public static String getOnlineUser() {
        //遍历集合，遍历 HashMap 的key
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUserList = "";
        while (iterator.hasNext()) {
            onlineUserList += iterator.next().toString() + " ";
        }
        return onlineUserList;
    }
}
