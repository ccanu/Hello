package com.hspedu.interface_;
//phone 类实现usb
//phone类需要实现usbinterface接口
public class Phone  implements  USBinterface{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
