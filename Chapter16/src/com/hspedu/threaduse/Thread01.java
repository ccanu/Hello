package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {
        Cat cat = new Cat();
        //cat.start();//启动线程->最终会执行cat的run方法
        cat.run();

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for(int i = 0; i < 10 ; i++) {
            Thread.sleep(1000);

        }

    }
}
//1.当一个类继承了 Thread 类，该类就是一个线程
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        //Ctrl + Alt + T
        System.out.println("小猫" + (++times));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(times == 80 ) {

        }

    }
}
