package com.hspedu.abstract_;

public class AA extends  Template{
    //计算任务
    //1 + + 10000

    public  void  job() {//实现template的抽象方法job
        long start = System.currentTimeMillis();
       long num = 0;
        for (long i = 0; i < 100000; i++) {
            num += i;
        }

    }
}
