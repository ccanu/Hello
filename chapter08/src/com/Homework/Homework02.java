package com.Homework;

public class Homework02 {
    public static void userRegister(String name, String pwd, String email) {
        // 验证用户名长度为2或3或4
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度必须为2、3或4");
        }

        // 验证密码长度为6，且全是数字
        if (pwd.length() != 6 || !isDigital(pwd)) {
            throw new RuntimeException("密码长度必须为6且全是数字");
        }

        // 验证邮箱中包含@和.，且@在.的前面
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j > i)) {
            throw new RuntimeException("邮箱必须包含'@'和'.'，且'@'必须在'.'的前面");
        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
