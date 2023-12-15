package com.ccy.negexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11c8";
        String regStr = "(?i)abc";//abc不区分大小写
       // String regStr = "a(?i)bc";bc不区分大小写
        //String regStr = "a((?i)b)c";只有b不区分大小写
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
