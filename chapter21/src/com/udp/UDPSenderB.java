package com.udp;

import java.io.IOException;
import java.net.*;

@SuppressWarnings({"all"})
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //创建 DatagramSocket 对象，准备在9998端口 接受数据
        DatagramSocket socket = new DatagramSocket(9998);
        //2.将需要发送的数据，封装到 DatagramPacket对象
        byte[] data = "hello 明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.19"), 9999);

        socket.send(packet);

        //2.构建一个 DatagramPacket,准备接收数据
        //一个数据包最大64k
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        //3.调用接受方法,将通过网络传输的 DatagramPacket 对象,填充到 packet对象
        //当有数据包发送到 本机的9999端口时，就会接收到数据
        socket.receive(packet);

        //4.可以把packet 进行拆包，取出数据，并显示。
        int length = packet.getLength();//实际接受到的数据长度
         data = packet.getData();//接收到数据
        String s = new String(data , 0 , length);
        System.out.println(s);
        socket.close();
        System.out.println("A端退出...");


    }
}
