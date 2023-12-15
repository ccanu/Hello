package com.hspedu.innerclass;

public class AnoymousInnerClass {
    public static  void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class  Outer04 {
    private  int n1 = 10;

    public void method(){
        //基于接口的匿名内部类
        //1。需求：想使用IA接口，并创建对象
        //Tiger只用一次，后面再不使用
        //可以使用匿名内部类简化
        //tiger的编译类型 IA
        //tiger的运行类型 匿名内部类
        /*
        看底层
        class XXXX implements IA {
         @Override
            public void cry() {

            }
        }
         */
        //JDK底层在创建匿名内部类outer04

        IA tiger = new IA() {
            @Override
            public void cry() {

            }
        };
        System.out.println("tiger的运行类型是" + tiger.getClass());
        tiger.cry();
        //基于类的匿名内部类
        //father 编译类型Father
        //father运行类型 Outer04$2
        /*
        class Outer04@2 extends Father{
          @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法"
                }
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("运行类型" + father.getClass());
        father.test();
         //基于抽象类的匿名内部类
        new Animal() {
            @Override
            void eat() {
                System.out.println("狗狗吃人");
            }
        };


    }
}
interface IA {
    public  void  cry();
}

interface A {
    public  void  cry();
}

class  Father {
    public  Father(String name) {//构造器
        super();
    }
    public  void test() {//方法

    }
}

abstract  class  Animal {//抽象类
    abstract  void  eat();
}