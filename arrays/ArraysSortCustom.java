package com.hspedu.arrays;

import com.hspedu.super_.A;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysSortCustom {
    public static void main(String[] args) {
        int[] arr = {1, -1 ,8,0,20};
        bubble01(arr);

        System.out.println(Arrays.toString(arr));
        }
        //冒泡を使ってソートする
        public static void bubble01(int[] arr) {
        int temp = 0;
        for(int i = 0; i < arr.length - 1 ; i ++) {
            for(int j = 0; j < arr.length -1 - i; j ++) {
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j +1] = temp;
                }
            }
        }
        }
        //冒泡 + 定制
        public static void bubble02(int[] arr, Comparator c){
        int temp = 0;
            for(int i = 0; i < arr.length - 1 ; i ++) {
                for(int j = 0; j < arr.length -1 - i; j ++) {
                    if(c.compare(arr[j],arr[j + 1]) > 0) {
                        temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j +1] = temp;
                    }
                }
            }
        }
    }


