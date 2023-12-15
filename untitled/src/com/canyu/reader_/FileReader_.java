package com.canyu.reader_;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {
        // 文件的路径
        String filePath = "D:\\story.txt";
        FileReader fileReader = null;
        int data = 0;

        // 1. 创建 FileReader 对象
        try {
            fileReader = new FileReader(filePath);

            // 2. 循环读取文件内容，使用 read 方法
            while ((data = fileReader.read()) != -1) {
                System.out.println((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(); // 处理 IOException 异常
        } finally {
            try {
                // 3. 关闭 FileReader，在 finally 块中确保关闭
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                // 处理关闭文件时的异常
                throw new RuntimeException(e);
            }
        }
    }
}