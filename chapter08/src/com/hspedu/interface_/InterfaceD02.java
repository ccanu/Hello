package com.hspedu.interface_;

public class InterfaceD02 {
    public static void main(String[] args) {

    }
}
interface IB {
    //接口中的属性只能是final的，public static final 修饰符
    //接口中的属性访问形式：接口名.属性名
    int n1 = 10;
    void hi();
}
interface  IC{
    void say();
}
interface  IE {

}
class  Pig implements  IB,IC {
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
