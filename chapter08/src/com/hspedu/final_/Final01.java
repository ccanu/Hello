package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {
E e = new E();
//e.TAX_RATE = 0.09;
    }
}
//如果过我们要求A类不能被其他类继承
//可以使用final修饰
class A {

}

//class B extends A {}

class C {
    //如果我们要求hi不能被子类重写
    //可以使用final修饰
    public  void  hi() {}
}

class D extends  C {
    @Override
    public void hi() {
        super.hi();
        System.out.println("重写了C类和hi方法");
    }
}
class E {
    public  final double TAX_RATE = 0.08;
}

//当不希望某个局部变量被修改可以用final修饰
class F {
    public  void  cry() {
        //这时NUM也被称为局部常量
        final double NUM = 0.01;
       // NUM = 0.9;
        System.out.println("NUM=" + NUM);
    }
}