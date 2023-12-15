package com.hspedu.reflection.class_;

import java.io.Serializable;

public class AllTypeClass {
    public static void main(String[] args) {
        Class<String> cs1 = String.class;//外部类
        Class<Serializable> cs2 = Serializable.class;//接口
        Class<Integer[]> cs3 = Integer[].class;//数组
        Class<float[][]> aClass = float[][].class;//二维数组
        Class<Deprecated> cs4 = Deprecated.class;//注解
        Class<Thread.State> stateClass = Thread.State.class;//枚举
        Class<Long> cs7 = long.class;//基本数据类型
        Class<Void> cs8 = void.class;//void数据类型
    }
}
