package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args){
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        String details = "----------零钱通明细---------";

        double money = 0;
        double balance = 0;
        Date date = null;//date 是java.util.Date的日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String note = "";
        do {
           System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case"2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    if(money >0) {
                        balance += money;
                        date = new Date();
                        System.out.println(sdf.format(date));
                        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    }else {
                        System.out.println("输入金额要》0");
                    }
                    break;
                case"3":
                    System.out.print("消费金额");
                    money = scanner.nextDouble();
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    date = new Date();
                    System.out.println(sdf.format(date));
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case"4":
                    String choice = "";
                    while (true){
                        System.out.println("确定要推出吗？ y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                        if(choice.equals("y")) {
                            loop = false;
                        }
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("菜单有误，重新选择");


            }



        }while(loop);
    }
}
