package com.hspedu.innerclass;

public class AnoymousInnerClassD {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05 {
    private  int n1 = 99;
    public void f1() {
        //不能添加访问修饰符
        //作用域：仅仅在定义它的方法或代码块中

        Person p = new Person() {
            @Override
            public void hi() {

            }
        };
        p.hi();//动态绑定,运行类型是Outer05$1
        //也可以直接调用,匿名内部类本身也是返回对象
        new Person(){
            @Override
            public void hi() {
                super.hi();
                //可以直接访问外部类的所有成员

            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("kack");
    }
}
class Person {
    public  void hi() {
        System.out.println("Person hi(");
    }
    public  void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}