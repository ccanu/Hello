package com.hspedue.Map_;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings({"all"})

public class map_ {
    public static void main(String[] args) {
        //解読Mapインタフェース実現クラスの特徴
        //1.Mapはコレクションと並んで存在する。マッピング関係を持つデータを保存するには：Key-Value（2列要素）
        //2.Mapのkeyとvalueは、HashMap$Nodeオブジェクトにカプセル化される任意の参照タイプのデータであり得る
        //3.Mapのkeyは、HashSetと同様にソースコードを前に分析したため、繰り返してはいけません。
        Map map = new HashMap();
        map.put("no1","金泉宇");//k - v
        map.put("no2","金峻宇");//k -v
        map.put("no1","全艺魁");//同じkがあれば置換と同等
        map.put("no3","全艺魁");//k-v
        map.put(null,null);//k-v
        map.put(null,"abc");//同じkがあれば置換と同等
        map.put("no4",null);//k-v
        map.put(1,"金炫美");//k-v
        map.put(new Object(),"李宰赫");//k-v


        System.out.println("map=" + map);



    }
}
