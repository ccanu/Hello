package com.hspedu.interface_;

public class InterfaceD01 {
    public static void main(String[] args) {

    }
}

interface  IA{
    //1。接口不能被实例化   2.接口中的所有方法是public 3.一个普通类实现口，就必须该接口的所有方法都实现
    //4.抽象类去实现接口时，可以不用抽象方法
    void say();//修饰符 public protected 默认 private
    void  hi();
}
class  Cat implements  IA {
    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}
abstract  class Tiger implements  IA {

}