package com.hspedu.arrays;

import java.util.Arrays;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1,2,90,123,567};
        //二分探索法による探索
//binarySearch二股検索
//配列が順序付けられていることを要求します。配列が無秩序であれば、binarySearchは使用できません
//3.配列に要素が存在しない場合は-1を返します。

        int index = Arrays.binarySearch(arr,123);
        System.out.println("index=" + index);

        //copyOf 配列要素のコピー
        //1.arr配列から、arr.length個の要素をnewArr配列にコピーする

        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(newArr));

        //ill 配列要素のじゅうてん
        Integer[] num = new Integer[]{9,3,2};

        Arrays.fill(num, 99);
        System.out.println(Arrays.toString(num));

        Integer[] arr2 = {1,2,90,123};
        //1.arrとarr 2配列要素が同じであれば、方法true、完全同じでなければfalseに戻る


        boolean equals = Arrays.equals(arr, arr2);
        System.out.println("equals=" + equals);

        //asListメソッドは、（2、3、4、5、6、1）データを1つのListコレクションに変換します
//2返されたasListコンパイルタイプList（インタフェース）
//3 asList運転タイプ
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asList=" + asList);
        System.out.println("asList的运行类型" + asList.getClass());
    }
}
