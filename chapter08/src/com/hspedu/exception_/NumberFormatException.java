package com.hspedu.exception_;

public class NumberFormatException {
    public static void main(String[] args{
        String name = "打击的你大";
        int num = Integer.parseInt(name);//抛出numbeirformatexceptioin
        System.out.println(num);
    }
}
