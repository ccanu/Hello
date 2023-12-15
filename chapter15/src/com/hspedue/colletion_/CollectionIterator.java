package com.hspedue.colletion_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));
        //先得到col对应的迭代器
        Iterator<Book> iterator = col.iterator();
        //使用while循环遍历
        while (iterator.hasNext()) {
            //返回下一个元素，类型是object
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
        //快速生成while => itit
        while (iterator.hasNext()) {
            Book next =  iterator.next();

        }
        //当退出while循环后，这时iterator迭代器，指向最后的元素
        iterator.next();
        //如果希望再次遍历，需要重置我们的迭代器
        iterator = col.iterator();
        System.out.println("====第二次遍历=====");

        while (iterator.hasNext()) {
            //返回下一个元素，类型是object
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }
    }
}


class Book {
    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }
}