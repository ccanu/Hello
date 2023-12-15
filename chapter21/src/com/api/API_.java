package com.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        // ローカルマシンのInetAddressオブジェクトを取得する
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//DESKTOP-1MJSNNU/192.168.1.19

        // 指定されたホスト名に基づいてInetAddressオブジェクトを取得する
        InetAddress host1 = InetAddress.getByName("DESKTOP-1MJSNNU");
        System.out.println("host1=" + host1);

        //3.指定されたドメイン名に基づいてInetAddressオブジェクトを取得する
        InetAddress host2 = InetAddress.getByName("www.baidu.com");

    }
}
