package com.hspedu.final_;

public class FinalE01 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("面积" + circle.calArea());
    }
}

class Circle {
    private   double radius;
    private  final  double PI;
    public Circle(double radius) {
        this.radius = radius;

    }
    {
        PI = 3.14;
    }

    public double calArea() {
        return PI * radius * radius;
    }
}
