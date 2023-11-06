package com.hspedue.colletion_.List_;

import java.util.ArrayList;
import java.util.List;

public class list_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");

        System.out.println("lise=" + list);
        //2.List集合中的每个元素都有其对应的顺序索引，即支持索引
        // 索引是从0开始的
        System.out.println(list.get(3));//hsp


    }

}
