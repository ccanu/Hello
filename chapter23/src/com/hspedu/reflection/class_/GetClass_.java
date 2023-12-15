package com.hspedu.reflection.class_;

public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        String classAllPath = "com.hspedu.Car";
        Class<?> aClass = Class.forName(classAllPath);

    }
}
