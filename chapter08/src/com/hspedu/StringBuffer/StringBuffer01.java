package com.hspedu.StringBuffer;

public class StringBuffer01 {
    public static void main(String[] args) {

        //StringBuffer的直接父类 是 AbstractStringBuilder
        //StringBuffer 实现了 Serializable
        //StringBuffer 是final类，不能被继承

        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
