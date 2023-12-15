package com.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //创建一个DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket,准备接收数据
        //一个数据包最大64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用接受方法,将通过网络传输的 DatagramPacket 对象,填充到 packet对象
        //当有数据包发送到 本机的9999端口时，就会接收到数据
        System.out.println("接收端A 等待接收数据");
        socket.receive(packet);
        //4.可以把packet 进行拆包，取出数据，并显示。
        int length = packet.getLength();//实际接受到的数据长度
        byte[] data = packet.getData();//接收到数据
        String s = new String(data , 0 , length);
        System.out.println(s);

        //2.将需要发送的数据，封装到 DatagramPacket对象
         data = "明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.19"), 9999);

        socket.send(packet);

        //关闭
        socket.close();



    }
}
