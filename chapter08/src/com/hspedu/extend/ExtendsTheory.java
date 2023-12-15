package com.hspedu.extend;

public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        System.out.println(son.name);

    }
}

class GrandPa {
    String name = "牛爷爷";
  String hobby = "旅游";
  int age = 100;
}
class Father extends Grandpa {
    String name = "牛爹";
    private int age = 39;
    public int getAge() {
        return age;
    }

}

class Son extends Father {
    String name= "大儿子";
}


