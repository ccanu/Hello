package com.hspedue.collections_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("tom");
        list.add("smith");
        list.add("king");
        list.add("milan");
        //reverse（List）：List内の要素の順序を反転
        Collections.reverse(list);
        //shuffle（List）：List集合要素のランダムな順序付け
        Collections.shuffle(list);
        //sort（List）：指定されたList集合要素を要素の自然順府に基づいて昇順に並べ替える
        Collections.sort(list);
        //sort（List，Comparator）：指定されたComparatorによって生成された順序に従ってList集合要素
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return((String)o1).length() - ((String)o2).length();
            }
        });
        //swap（List，int，int）：指定されたlist集合のi箇所の要素利j箇所の要素を交換する
        Collections.swap(list,0,1);
        //Object max（Collection）：要素の自然な順序に基づいて、与えられたコレクションの中で最大の要素を返す
        System.out.println("自然顺序最大元素" + Collections.max(list));
        //0bject max（Collection，Comparator）：Comparatorで指定された順序に従って、指定されたコレクション内の最大要素を返します
        Object maxObject = Collections.max(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() -((String)o2).length() ;
            }
        });
        //int frequency（Collection，Object）：指定されたコレクション内の指定された要素の出現回数を返します
        System.out.println(Collections.frequency(list,"tom"));
        //void copy（List dest，List src）：srcの内容をdestにコピー
        ArrayList dest = new ArrayList();
        //完全なコピーを作成するためには、まずdestに値を割り当てる必要があります。サイズはlist.size()と同じです
        for (int i = 0; i < list.size();i++) {
            dest.add("");
        }
        Collections.copy(dest,list);



    }
}
