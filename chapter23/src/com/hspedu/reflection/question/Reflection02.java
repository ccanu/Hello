package com.hspedu.reflection.question;

import com.hspedu.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();

    }
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for(int i = 0 ; i< 900000000;i++) {
           cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
    //用反射机制调用方法hi
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hspedu.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for(int i = 0 ; i< 900000000;i++) {
           hi.invoke(o);
        }
        long end = System.currentTimeMillis();
    }
}
