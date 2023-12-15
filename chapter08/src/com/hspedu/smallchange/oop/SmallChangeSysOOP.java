package com.hspedu.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSysOOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String details = "----------零钱通明细---------";

    double money = 0;
    double balance = 0;
    Date date = null;//date 是java.util.Date的日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    String note = "";
    public void mainMenu(){
        do {
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退     出");

            System.out.println("请选择（1-4）：");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case"2":
                    this.income();
                    break;
                case"3":
                    this.cost();
                    break;
                case"4":
                    this.exit();
                    break;
                default:
                    System.out.println("菜单有误，重新选择");


            }



        }while(loop);

    }
public void detail() {
    System.out.println(details);

}
public  void income() {
    System.out.println("收益入账金额");
    money = scanner.nextDouble();
    if(money <= 0) {
        System.out.println("收益入账金额大于0");
        return;
    }
        balance += money;
        date = new Date();

        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;

    }
public  void cost() {
    System.out.print("消费金额");
    money = scanner.nextDouble();
    System.out.print("消费说明：");
    note = scanner.next();
    balance -= money;
    date = new Date();
    System.out.println(sdf.format(date));
    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
}
public void exit() {
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
}

}
