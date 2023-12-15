package com.hspedu.Object_;

public class ToString_ {
    public static void main(String[] args) {
        new Monster("小妖怪","巡山",1000);
        System.out.println(monster.toSring());
    }
}

class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }
}
