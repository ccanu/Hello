package com.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        //第3世代日付
        //1.使用now（）返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();
        System. out. println(ldt);

        //2.使用DateTimeFormatter 对象来进行格式化
//创建 DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH小时mm分钟ss秒");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);
        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());
        System.out.println("月=" + ldt.getMonthValue());
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate now = LocalDate.now();//可以获取年月日

        LocalTime now2 = LocalTime.now();//获取到时分秒

/*
        ldt. getYear();
        ldt. getMonthValue();
        ldt. getMonth();
        ldt. getDayOfMonth();
        ldt. getHour();
        ldt. getMinute();
        ldt. getSecond();

 */
    }
}
