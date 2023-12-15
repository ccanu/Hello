package com.hspedu.innerclass;

public class AnoymousInnerClassE01 {
    public static void main(String[] args) {
        //当作实参直接传递
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅明画");
            }
        });
    }
    //静态方法
    public  static  void  f1(IL il) {
        il.show();
    }
}
//接口
interface  IL {
    void  show();
}
class Picture implements  IL {
    @Override
    public void show() {

    }
}