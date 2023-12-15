package com.hspedu.StringBuffer;

public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器使用
        //创建一个大小为16的char[],用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer(100);

        //2 通过构造器指定char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);
        //3 通过给一个String 创建stringBuffer
        StringBuffer hello = new StringBuffer("hello");

    }
}
