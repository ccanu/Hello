package com.hspedu.abstract_;

public class BB {
    public  void  job() {
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 0; i < 80000; i++) {
            num *= i;
        }
        long end = System.currentTimeMillis();
        System.out.println("执行时间" + (end - start));
    }
    public  void  job2() {

    }
}
