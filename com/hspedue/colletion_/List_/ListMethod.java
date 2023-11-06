package com.hspedue.colletion_.List_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("胡仙溪");
        list.add(1,"灿宇");
        //index=1の場所にオブジェクトを挿入する
        System.out.println("list" + list);
        //boolean addAll（int index，Collection eles）：index位置からeles内のすべての要素を追加.
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list" + list);
        //int indexOf（Object obj）：コレクション内でobjが最初に表示された場所を返す
        System.out.println(list.indexOf("tom"));
        //Object remove（int index）：indexの場所を指定した要素を除去し、この要素を返します
        list.remove(0);
        System.out.println("list=" + list);
        //Object set（int index，Object ele）：indexの位置を指定する要素をelesとして設定し、置換する
        list.set(1,"marry");
        System.out.println("list=" + list);



    }
}
