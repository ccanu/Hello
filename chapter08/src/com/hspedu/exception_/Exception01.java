package com.hspedu.exception_;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
//因为num1 / num2 = 0，程序会出现抛出
        //如果出现异常、问题，可以使用try-catch
        //选中代码块→快捷键 ctrl + alt + t >选中 try catch
        //如果进行了异常处理，那么即使出现了异常，程序可以继续执行
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
