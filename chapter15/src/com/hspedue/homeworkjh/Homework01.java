package com.hspedue.homeworkjh;

import java.util.ArrayList;

public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒赴恒河圣浴引民众担忧"));
        arrayList.add(new News("男子突然想起2个月前钓的鱼还在网兜里，捞起一看赶紧放生"));
        int size = arrayList.size();
        for(int i = size - 1;i >= 0 ; i--) {
            News news =(News)arrayList.get(i);
            System.out.println(processTitle(news.getTittle()));
        }
    }
    public static String processTitle(String title) {
        if (title == null) {
            return "";
        }
        if (title.length()>15) {
            return title.substring(0,15) + "...";
        }else {
            return title;
        }
    }
}
/**
 要件に応じて実装：
 （1）見出しとコンテンツ属性を含むニュースクラスをカプセル化し、get、set方法を提供し、toString方法を書き換え、オブジェクトを印刷する時（2）パラメータ付きコンストラクタを1つだけ提供し、オブジェクトをインスタンス化する時、見出しだけを初期化する、2つのオブジェクトをインスタンス化します。
 ニュース1：新型コロナ感染者が1000万人を超え、数百万人のヒンドゥー教信者がガンジス川の「聖浴」に赴き、人々を心配させたニュース2：男性は突然、2カ月前に釣った魚がまだ網のポケットにあったことを思い出し、すくって見て急いで放生した（3）ニュースオブジェクトをArrayList集合に追加し、逆順に遍歴した、
 （4）集合を巡回する過程で、ニュース見出しを処理し、15字を超えるものは前の15個だけを残し、後に「...」を付ける

 **/
class News {
    private String tittle;
    private String content;

    public News(String tittle) {
        this.tittle = tittle;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "tittle='" + tittle + '\'' +
                '}';
    }
}
