package com.hspedue.colletion_;

import java.util.ArrayList;
import java.util.HashMap;

public class collection {
    public static void main(String[] args) {
        //1.集合は主に2組（単列集合、二列集合）
        //2.Collectionインタフェースには2つの重要なサブインタフェースList Setがあり、実装サブクラスはすべて単列集合である
        //3.Mapインタフェースの実装サブクラスは2列集合であり、格納されたK-V

        //Collection
        //Map
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");

        HashMap hashMap = new HashMap();
        hashMap.put("No1" , "北京");
        hashMap.put("No2" , "上海");
    }
}
