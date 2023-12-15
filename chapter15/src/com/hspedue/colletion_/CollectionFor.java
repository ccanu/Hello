package com.hspedue.colletion_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //エンハンスメントforを使用して、コレクションで
        //底面は依然として反復器であり、貯蔵層は簡略化版の反復器遍歴であることが理解できる
        //快捷方式I
        for(Object book : col) {
            System.out.println("book=" + book);
        }
        //增强forは配列で直接使用することもできます
        int[] nums = {1,8,10,90};
        for(int i : nums) {
            System.out.println("i" + i);
        }

    }
}
