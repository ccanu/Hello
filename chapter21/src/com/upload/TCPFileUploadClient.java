package com.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import com.upload.StreamUtils;
import java.net.UnknownHostException;

public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {
        //创建客户端链接服务器，得到socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String filePath = "d:\\aa.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes 就是filePath对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        bos.write(bytes);//将文件对应的字节数组的内容，写入到数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        String s =  StreamUtils.streamToString(inputStream);


        //关闭相关的流
        bos.close();
        socket.close();


    }
}
