package com.hspedu.Poly;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("tom");
        Dog dog = new Dog("大黄");
        Bones bones = new Bones("大棒骨");
        tom.feed(dog, bones);

        Cat cat = new Cat("大花");
        Fish fish = new Fish("黄花鱼");
        tom.feed(cat, fish);
    }
}
