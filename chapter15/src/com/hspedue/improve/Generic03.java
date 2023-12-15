package com.hspedue.improve;

public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("韩顺平教育");
        /*
        class Person<E> {
    String s;  //Eは、Personオブジェクトを定義する際に指定される、つまりコンパイル中にEがどのタイプであるかを決定するsのデータ型を表します

    public Person(String s) {
        this.s = s;
    }
    public String f() {
        return s;
    }
}
         */
        Person<Integer> person1 = new Person<>(100);
         /*
        class Person<E> {
    Integer s;  //Eは、Personオブジェクトを定義する際に指定される、つまりコンパイル中にEがどのタイプであるかを決定するsのデータ型を表します

    public Person(Integer s) {
        this.s = s;
    }
    public Integer f() {
        return s;
    }
}
         */
    }
}

class Person<E> {
    E s;  //Eは、Personオブジェクトを定義する際に指定される、つまりコンパイル中にEがどのタイプであるかを決定するsのデータ型を表します

    public Person(E s) {
        this.s = s;
    }
    public E f() {
        return s;
    }
}
