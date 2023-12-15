package com.hspedue.Map_;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("李宰赫",new Books(" ",100));
        map.put("李宰赫","金泉宇");//k - v
        map.put("任俊宇","金峻宇");//k -v
        map.put("金炫美","金峻宇");//同じkがあれば置換と同等
        map.put("崔灿宇",null);//k-v
        map.put(null,"朴志刚");//同じkがあれば置換と同等
        map.put("安佑真","张元英");//k-v
        System.out.println("map=" + map);

        //remove：根据键删除映射关系
        map.remove(null);
        System.out.println("map" + map);
        //get：根据键获取值
        Object val = map.get("安佑真");
        System.out.println("val=" + val);
        //size：获取元素个数
        System.out.println("k-v=" + map.size());
        //isEmpty：判断个数是否为0
        System.out.println(map.isEmpty());
        //claer:清除k-v
        map.clear();
        System.out.println("map" + map);
        //containsKey：查找键是否存在
        System.out.println(map.containsKey("ccy"));



    }
}

class Books {
    private String name;
    private int num;
    public Books(String name, int num) {
        this.name = name;
        this.num = num;
    }


}