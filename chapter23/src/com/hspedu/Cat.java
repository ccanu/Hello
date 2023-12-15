package com.hspedu;

public class Cat {
    private String name = "金米妮";
    public int age = 10;
    public Cat() {
        this.name = name;
    }
    public void hi(){
        System.out.println("hi" + name);
    }
    public void cry() {
        System.out.println(name + "喵喵叫");
    }
}
