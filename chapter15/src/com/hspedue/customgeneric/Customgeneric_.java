package com.hspedue.customgeneric;

public class Customgeneric_ {
    public static void main(String[] args) {

    }
}


///1.Tigerの後ろにある汎型なので、Tigerをカスタム汎型クラスと呼んでいます
//2、T、R、M汎型の識別子、一般的には単一の大文字
//3.汎型識別子は複数あってもよい。
//4.一般メンバーは汎型（属性、方法）を使用することができる
class  Tiger<T,R,M> {
    String name;
    R r;//小写是属性
    M m;
    T t;

    public Tiger(String name, R r, M m, T t) {//コンストラクタ使用汎型
        this.name = name;
        this.r = r;
        this.m = m;
        this.t = t;
    }
    //メソッドの使用方法

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public R getR() {
        return r;
    }

    public void setR(R r) {
        this.r = r;
    }

    public M getM() {
        return m;
    }

    public void setM(M m) {
        this.m = m;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}