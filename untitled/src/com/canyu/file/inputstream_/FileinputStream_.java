package com.canyu.file.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStream_ {
    public static void main(String[] args) {

    }
    @Test
    public  void readFile01() {
        String filePath = "D:\\ha.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件

            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止。
            while ((readData = fileInputStream.read()) != -1) {
                System.out.println((char)readData);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
