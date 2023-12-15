package com.hspedu.StringBuffer;

public class StringAndStringBuffer {
    public static void main(String[] args) {

        String str = "hello tom";
        //方式1使用构造器
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();

        stringBuffer1 = stringBuffer1.append(str);
        //看看StringBuffer ->String
        StringBuffer stringBuffer3 = new StringBuffer("我是大哥大");
        //方式1 使用StringBuffer提供的toString方法
        String s = stringBuffer3.toString();

        //使用构造器来搞定
        String s1 = new String(stringBuffer3);
    }
}
