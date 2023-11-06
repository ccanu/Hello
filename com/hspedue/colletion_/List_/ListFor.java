package com.hspedue.colletion_.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListFor {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("胡仙溪");
        list.add("鱼香肉丝");
        list.add("北京烤鸭");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        //增强for
        }
        for (Object o :list) {
            System.out.println("o=" + o);

        }
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象=" + list.get(i));
            
        }

    }
}
