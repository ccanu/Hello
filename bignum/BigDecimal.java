package com.hspedu.bignum;

public class BigDecimal {
    public static void main(String[] args) {
        //精度の高い数を保存する必要がある場合、doubleは十分ではありません。bigdecimalでもかまいません
        BigDecimal bigDecimal = new BigDecimal("1198.22222222222222222222226666662");
        BigDecimal bigDecimal1 = new BigDecimal("1.1");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal);
    }
}
