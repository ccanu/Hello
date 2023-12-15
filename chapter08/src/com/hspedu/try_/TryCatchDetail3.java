package com.hspedu.try_;

import java.util.Scanner;

public class TryCatchDetail3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = " ";
        while (true) {
            System.out.println("请输入一个整数：");
            inputStr = scanner.next();
            Integer.parseInt(scanner.next());
            try {
                num = Integer.parseInt(inputStr);//可能输出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是整数");
            }
        }

        System.out.println("输入的是整数" + num);
    }
}
