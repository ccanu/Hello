package com.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("c=" + c);
        //2.カレンダ・オブジェクトのカレンダ・フィールドの取得
        System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + c.get(Calendar.MONTH) + 1);
        System.out.println("月：" + c.get(Calendar.DAY_OF_MONTH) );
        System.out.println("月：" + c.get(Calendar.HOUR) );
        System.out.println("年：" + c.get(Calendar.MINUTE));
        System.out.println("年：" + c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DAY_OF_MONTH) + "-"
        + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
}
