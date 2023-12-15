package com.hspedu.interface_;

public class Computer {
    public  void work(USBinterface usBinterface) {
        //通过接口来调用方法
        usBinterface.start();
        usBinterface.stop();
    }
}
