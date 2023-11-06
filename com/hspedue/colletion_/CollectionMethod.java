package com.hspedue.colletion_;

import java.util.ArrayList;
import java.util.List;

public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("lise=" + list);
        //删除指定元素
        list.remove(0);//删除第一个元素
        System.out.println("lise=" + list);
        //查找某个元素
        System.out.println(list.contains("jack"));
        //size:获取元素个数
        System.out.println(list.size());
        //isEmpty判断是否为空
        System.out.println(list.isEmpty());
        //clear清空
        //list.clear();
        //addAll 添加多个元素
        ArrayList list2 = new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list2.addAll(list2);
        System.out.println("lise=" + list);
        //containsAll：查找多个元素是否都存在
        System.out.println(list.containsAll(list2));
        //removeAll,删除多个元素
        list.removeAll(list2);
        System.out.println("lise=" + list);



    }
}
