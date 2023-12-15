package com.hspedu.reflection.class_;

import com.hspedu.Car;
import com.hspedu.Cat;

import java.lang.reflect.Field;

public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath = "com.hspedu.Car";
        Class<?> cls = Class.forName(classAllPath);
        System.out.println(cls);//显示cls对象，是哪个类的Class对象 com.hspedu.Car
        System.out.println(cls.getClass());//输出cls运行类型 java.lang.Class
        System.out.println(cls.getClass().getName());//包名
        System.out.println(cls.getName());//全类名
        //通过cls创建对象实例
        Car car = (Car) cls.newInstance();
        System.out.println(car);//car.toString()
        //6.通过反射获得属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));//宝马
        //通过反射给属性赋值
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));//奔驰
        //得到所有的属性
        Field[] fields = cls.getFields();
        for(Field f : fields) {
            System.out.println(f.getName());
        }


    }
}
