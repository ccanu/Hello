package com.hspedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {

        //プログラミングには大きな整数を処理する必要があり、longは不足です
        //bigintegerの类ガつかえます
 //       long l = 237888888999l;
     //   System.out.println("ls" + l);
        BigInteger bigInteger = new BigInteger("233333333333333333333333333333333333333333333232323223");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
        //integerでの加減乗除には対応する方法が必要です
        //操作するbigintegerを作成して適切な操作を行うことができます
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);

    }
}
