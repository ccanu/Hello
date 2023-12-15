package com.hspedue.improve;

import java.util.*;

public class GenericEx01 {
    public static void main(String[] args) {
        //Hashsetにパンタグラフを使用して3人の学生オブジェクトを入れる
        HashSet<Student> students = new HashSet<Student>();
        students.add(new Student("qyu",16));
        students.add(new Student("jyu",20));
        students.add(new Student("ryu",24));
//遍历
        for (Student student : students) {
            System.out.println(student);
        }
        //Hashmapにパンタグラフを使用して3人の学生オブジェクトを入れる
        HashMap<String, Student> hm = new HashMap<>();
        hm. put("milan", new Student("milan", 38));
        hm. put("smith", new Student("smith", 48));
        //迭代器 Entryset
        /*
public Set<Map. Entry<K,V>> entrySet() {
Set<Map. Entry<K,V>> es; return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
*/
       Set<Map. Entry<String, Student>> entries = hm. entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();


    }
}
class Student {
    private String name;
    private int age;

    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
