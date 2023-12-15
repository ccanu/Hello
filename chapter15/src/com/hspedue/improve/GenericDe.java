package com.hspedue.improve;

import java.util.ArrayList;
import java.util.List;

public class GenericDe {
    public static void main(String[] args) {
        //1.给泛型指向数据类型是，要求是引用类型，不能是基本数据类型
        List<Integer> list = new ArrayList<>();//OK
//List<int> list2 = new ArrayList<int>（）；//错误
//2.
        //2.说明
//因为 E 指定了 A 类型，构造器传入了 new AC）
        //在给泛型指定具体类型后，可以传入该类型或者其子类类型
        Pig<A> aPig = new Pig<A>(new A());
        aPig.f();
        Pig<A> aPig2 = new Pig<A>(new B());
        aPig2.f();
        //3.泛型的使用形式
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
//在实际开发中，我们往往简写
//编译器会进行类型推断
        ArrayList<Integer> list3 = new ArrayList<>();
        List<Integer> list4 = new ArrayList<>();

    }
}
class A{}
class B extends A{}

class Pig<E> {
    E e;

    public Pig(E e) {
        this.e = e;
    }
    public void f() {
        System.out.println(e.getClass());
    }
}

