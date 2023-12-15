package com.hspedue.colletion_.List_;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for(int i = 0;i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);
        //2番に要素「韓順平教育」を挿入
        list.add(1,"韓順平教育");
        System.out.println("第五个元素" + list.get(4));

    }
}
