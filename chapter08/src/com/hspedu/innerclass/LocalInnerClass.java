package com.hspedu.innerclass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();

    }
}

class Outer02 {//外部类
    private  int n1 = 100;
    private  void m2() {}
    public  void m1() {//方法
        //局部内部类是定义在外部类的局部位置
        //不能添加访问修饰符，但是可以用final修饰
        //作用域：仅仅在定义它的方法或代码块中
        final class Inner02 {//局部内部类
            //可以访问外部类的所有成员，包括私有的
            private  int n1 = 800;
            public  void  f1() {
                //局部内部类可以直接访问外部类的成员，比如下面外部类n1和m2()
                //如果外部类和内部类的成员重名时，默认遵循就近原则
                //使用 外部类名.this.成员 去访问
                //Outer02.this本身就外部类的对象，哪个对象用了m1，就是Outer02.this就是哪个对象
                System.out.println("n1=" + n1 + "外部类的n1" + Outer02.this.n1);
             m2();
            }
        }
        //外部类在方法中可以创建inner02对象，然后调用方法
        Inner02 inner02 = new Inner02();



}