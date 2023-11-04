package com.date_;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class Date01 {
    public static void main(String[] args) {

        //1、現在のシステム時間の取得
        //2.ここのDateクラスはjava.utilパッケージにあります
        //3.デフォルト出力の日付フォーマットは海外仕様なので、通常はフォーマットを変換する必要があります

        Date d1 = new Date();//現在のシステム時間の取得
        System.out.println("当前日期=" + d1);
       Date d2 = new Date(9234567);//ミリ秒数を指定して時間を得る
        System.out.println("d2=" + d2);
        //System.out.println(d1.getTime());
        //SimpleDateFormat対象を作って,適切なフォーマットを指定できます
        //ここの書式ではアルファベットが規定されています
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期" + format);
        //フォーマットされたStringを対応するDateに変換できます
        String s = "1996年01月01日 10：20：30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + sdf.format(parse));
    }
}
