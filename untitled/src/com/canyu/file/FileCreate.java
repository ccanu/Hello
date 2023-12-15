package com.canyu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        FileCreate fileCreate = new FileCreate();
        fileCreate.create01();

    }

    //方式1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "C:\\Users\\choic\\Desktop\\news1.txt";
        File file = new File(filePath);

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("文件创建成功");
            } else {
                System.out.println("文件已存在或创建失败");
            }
        } catch (IOException e) {
            System.err.println("创建文件时出错: " + e.getMessage());
        }



    }
    //方式2 new File（File parent，String child）//根据父目录文件+子路径构建
    //d:\\news2.txt
    @Test
    public void create02() {
        File parentFile = new File("D:\\");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile , fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public void create03(){
       String parentPath = "D:\\";
       String fileName = "news3.txt";
       File file = new File(parentPath , fileName);
       try {
           file.createNewFile();
           System.out.println("创建成功");
       }catch (IOException e ) {
           System.err.println(e.getMessage());
       }
       }

}
