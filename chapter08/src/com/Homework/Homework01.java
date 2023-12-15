package com.Homework;

public class Homework01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str);
        str = reverse(str, 1, 4);
        System.out.println(str);
    }
//（1）将字符串中指定部分进行反转。比如将"abcdef"反转为"aedcbf"
//（2）编写方法 public static String reverse（String str，int start，int end）搞定
        public static String reverse(String str,int start ,int end) {
            char[] chars = str.toCharArray();
            char temp = ' ';
            for(int i = start,j = end ; i <j;i++,j--) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

            }
            //使用chars重新构建一个string返回即可
            return new String(chars);


        }
    }

