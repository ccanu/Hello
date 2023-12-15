package com.hspedue.Map_;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.*;

@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("李宰赫",new Books(" ",100));
        map.put("李宰赫","金泉宇");//k - v
        map.put("任俊宇","金峻宇");//k -v
        map.put("金炫美","金峻宇");//同じkがあれば置換と同等
        map.put("崔灿宇",null);//k-v
        map.put(null,"朴志刚");//同じkがあれば置換と同等
        map.put("安佑真","张元英");//k-v

        //第一グループ：まずすべてのKeyを取り出し、Keyを通じて対応するValueを取り出す
        Set keyset = map.keySet();
        System.out.println("-----第一种方式-------");
        //(1)增强for
        for (Object key :keyset) {
            System.out.println(key + "-" + map.get(key));

        }
        //迭代器
        System.out.println("--------第二种方式-------");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();



        }

        //第二组，把所有的values取出
        Collection values = map.values();
        //这里可以使用所有的collections使用的遍历方法
        //(1)增强for
        System.out.println("-----取出所有的value 增强for-----");
        for (Object value : values) {
            System.out.println(value);

        }
        //(2)迭代器
        System.out.println("-----取出所有的value 迭代器-----");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组：通过EntrySet 来获取k-v
        Set entrySet = map.entrySet();
        //（1）增强for
        for (Object entry : entrySet) {
            //将entry 转成Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());

        }
        //(2)迭代器
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
            //System.out.println(entry.getClass());//HashMap$Node - > 实现 -> Map.Entry(getKey,getValue)


        }


    }
}
