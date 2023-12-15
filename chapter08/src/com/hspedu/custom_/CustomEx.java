package com.hspedu.custom_;

public class CustomEx {
    public static void main(String[] args) {
            int age = 80;
            //要求范围在18-120之间，否则抛出一个自定义异常
        if(!(age >=18 && age <=120)) {
            throw new AgeException("年龄要在18-120之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

class  AgeException extends  RuntimeException {
//自定义一个异常
    public AgeException(String message) {
        super(message);
    }
}
