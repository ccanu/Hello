package Set_;

public class HashSetStructer {
    public static void main(String[] args) {
       // HashSetの下地をシミュレートする（HashMapの下地構造）
        //1.Node[]タイプの配列を作成する
       //2.ノード[]配列をテーブルと呼ぶ人もいる
        Node[] table = new Node[16];

        //3 结点を作る
        Node john = new Node("john", null);
        table[2] = john;
        Node kim = new Node("kim", null);
        john.next = kim;
        Node sai = new Node("sai", null);
        kim.next = sai;
        Node hme = new Node("hme", null);
        table[3] = hme;

        System.out.println(table);
    }
}
class Node {
    Object item;//存放数据

    Node next;//指向下一个结点

    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }
}
