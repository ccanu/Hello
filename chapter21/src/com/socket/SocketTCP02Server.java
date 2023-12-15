package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
@SuppressWarnings({"all"})
public class SocketTCP02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();
        System.out.println("socket = " + serverSocket.getClass());
        InputStream inputStream = socket. getInputStream();
        //IO读取

        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));//根据读取到的实际长度，显示内容。

        }
        //ソケットに関連する出力ストリームを取得する
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
//设置结束标记




        //关闭流
        outputStream.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
