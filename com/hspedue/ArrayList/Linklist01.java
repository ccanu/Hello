package com.hspedue.ArrayList;

public class Linklist01 {
    public static void main(String[] args) {
        //簡単な双方向リンクテーブルをシミュレートする
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node can = new Node("can");

        //3つのノードを接続し、双方向リンクテーブルを形成する
        jack.next = tom;
        tom.next = can;

        can.pre = tom;
        tom.pre = jack;

        Node first = jack;//first参照をjackに向ける、双方向リンクテーブルのヘッダーノード
        Node last = can;////last参照をcanに向けると、双方向リンクテーブルの末尾ノードになる

        //プレゼンテーション、最初から最後までトラバース

////要求、tom canの中に、オブジェクトkimを挿入すること

        Node kim = new Node("kim");
        kim.next = can;
        kim.pre = tom;
        can.pre = kim;
        tom.next = kim;
        first = jack;
        while (true) {
            if (first == null) {
                break;
            }
            System.out.println(first);
            first = first.next;
        }
        while (true) {
            if (last == null) {
                break;
            }
            System.out.println(last);
            last = last.pre;
        }


    }
}

    //双方向リンク・テーブルのノードを表すノード・クラスを定義します
    class Node {
        public Object item;//本当にデータを保存する場所
        public Node next;//次のノードを指す

        public Node pre; //前のノードを指す

        public Node(Object name) {
            this.item = name;
        }

        public String toString() {
            return "Node name=" + item;
        }
    }


