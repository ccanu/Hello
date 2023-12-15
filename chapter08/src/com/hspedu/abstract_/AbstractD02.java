package com.hspedu.abstract_;

import javax.swing.plaf.PanelUI;

public class AbstractD02 {
    public static void main(String[] args) {

    }
}
//抽象方法不能使用private,final 和static来修饰，因为这些关键字都是和重写相违背的
abstract  class H{
    public  abstract  void hi();
}
abstract class E {
    public abstract void hi();
}
abstract  class  F extends  E {

}
class G extends  E {
    @Override
    public void hi() {//相当于G子类实现了父类E的抽象

    }
}
//抽象类的本质还是类，所以可以有类的各种成员
abstract class D {
    public  int n1 = 10;
    public  static  String name = "舒适是";
    public  void hi() {

    }

 }