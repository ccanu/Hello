package com.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class socketTCP01Client {
    public static void main(String[] args) throws IOException {

        //1. 実際のサーバーのIPアドレスを指定
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println(socket.getClass());
        // OutputStreamを取得
        OutputStream outputStream = socket.getOutputStream();

        //出力ストリームを使用してデータをデータチャネルに書き込む
        outputStream.write("hello,server".getBytes());
        //ストリームおよびソケットを閉じる
        outputStream.close();
        socket.close();
        System.out.println("客户端退出" );
    }
}
