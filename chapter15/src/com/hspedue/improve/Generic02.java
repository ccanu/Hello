package com.hspedue.improve;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("泉宇",10));
        arrayList.add(new Dog("峻宇",1));
        arrayList.add(new Dog("艺魁",5));
        //1.ArrayList<Dog>がArrayListコレクションに格納されている要素がDogタイプであることを示すとき
        //2.コンパイラが追加されたタイプを発見し、要件を満たしていない場合は、エラーが発生します
        //3.トラバース時にObjectではなくDogタイプを直接取り出すことができる
        for (Dog dog :arrayList) {
            System.out.println(dog.getName() + " - " + dog.getAge());

        }

    }
}
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
