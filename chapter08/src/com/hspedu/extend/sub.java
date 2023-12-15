package com.hspedu.extend;

public class sub extends Base{

    public sub(String name , int age) {
        super("hsp");
        System.out.println("子类sub()构造器被调用...");
    }
    public sub() {//构造器
        super("smith",10);
        System.out.println("子类sub()构造器被调用...");
    }
    public sub(String name) {//子类方法

        super("tom",30);
        System.out.println("子类sub(string name)构造器被调用...");
    }
}
