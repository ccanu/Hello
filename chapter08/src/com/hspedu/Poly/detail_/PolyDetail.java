package com.hspedu.Poly.detail_;

public class PolyDetail {
    public static void main(String[] args){
        Animal animal = new Cat();

        Cat cat = (Cat) animal;
        cat.catchMouse();

    }
}
