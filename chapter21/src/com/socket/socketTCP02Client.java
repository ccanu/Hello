package com.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
@SuppressWarnings({"all"})

public class socketTCP02Client {
    public static void main(String[] args) throws IOException {

        //1. 実際のサーバーのIPアドレスを指定
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println(socket.getClass());
        // OutputStreamを取得
        OutputStream outputStream = socket.getOutputStream();

        //出力ストリームを使用してデータをデータチャネルに書き込む
        outputStream.write("hello,server".getBytes());
        // 4. ソケットに関連する入力ストリームを取得します。データ（バイト）を読み取り、表示します
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream. read(buf)) != -1) {
            System.out.println(new String(buf, 0, readLen));
        }
        socket.shutdownOutput();
        //ストリームおよびソケットを閉じる
        inputStream.close();
        outputStream.close();
        socket.close();
        System.out.println("客户端退出" );
    }
}
