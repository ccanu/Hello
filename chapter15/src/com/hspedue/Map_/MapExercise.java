package com.hspedue.Map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        //添加对象
        hashMap.put(1,new Emp("jqy",30000,10));
        hashMap.put(2,new Emp("jjy",2000,11));
        hashMap.put(1,new Emp("ccy",13000,12));

        //遍历2种方式
        //并遍历显示工资>18000的员工（遍历方式最少两种）
        //1.keySet
        Set Keyset = hashMap.keySet();
        for (Object key : Keyset) {
            Emp emp = (Emp) hashMap.get(key);
            if(emp.getSar() > 18000) {
                System.out.println(emp);
            }


        }
        Set entrySet = hashMap. entrySet();
        Iterator iterator = entrySet. iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            //通过entry获得key和value
            Emp emp = (Emp) entry.getValue();
            if (emp.getSar() > 18000) {
                System.out.println(emp);
            }

        }


        //2.EntrySet



    }
}

class Emp {
    private String name;
    private double sar;
    private int id;


    public Emp(String name, double sar, int id) {
        this.name = name;
        this.sar = sar;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSar() {
        return sar;
    }

    public void setSar(double sar) {
        this.sar = sar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", sar=" + sar +
                ", id=" + id +
                '}';
    }


}
