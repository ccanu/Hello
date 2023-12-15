package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket accept = serverSocket.accept();
        System.out.println("socket = " + serverSocket.getClass());
        InputStream inputStream = accept. getInputStream();
        //IO读取

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));//根据读取到的实际长度，显示内容。

        }
        //关闭流
        inputStream.close();
        accept.close();
        serverSocket.close();

    }
}
