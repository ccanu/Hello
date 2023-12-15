package com.hspedue.customgeneric;

import java.util.ArrayList;

public class CustmonMethodG {


    public static void main(String[] args) {
         Car car = new Car();
         car.fly("奔驰",100);//メソッドを呼び出すと、パラメータ、コンパイラを入力して、タイプを決定します
         car.fly(300,100.1);


        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}

class Car {
    public void run() {

    }
    //1.<T，R>は汎型である
    //2.fly用に提供されている
    public<T,R> void fly(T t,R r) {
        System.out.println(t.getClass());//String

        System.out.println(r.getClass());//Integer

    }
}
class  Fish<T,R> {
    public void run() {

    }
    public<U,M> void eat(U u,M m) {

    }
    //1.以下のhiメソッドは汎型メソッドではない
    //2.はhiメソッドがクラス宣言を使用した汎型である
    public void hi(T t) {

    }
    public<K> void hello(R r , K k) {

    }
}
