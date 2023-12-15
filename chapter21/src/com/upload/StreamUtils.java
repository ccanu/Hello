package com.upload;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamUtils {
    public static byte[] streamToByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); // 出力ストリームオブジェクトを作成
        byte[] b = new byte[1024]; // バイト配列
        int len;
        while ((len = is.read(b)) != -1) { // ループして読み取り
            bos.write(b, 0, len); // 読み取ったデータをbosに書き込む
        }
        byte[] array = bos.toByteArray(); // そして、bosをバイト配列に変換
        bos.close(); // bosを閉じる
        return array; // 配列を返す
    }
    public static String streamToString(InputStream is) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder= new StringBuilder();
        String line;
        while((line=reader. readLine())!=null){
        builder. append(line+"\r\n");
    }
return builder. toString();
}


}

