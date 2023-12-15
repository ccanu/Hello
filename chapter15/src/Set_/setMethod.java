package Set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setMethod {
    public static void main(String[] args) {
        //1.Setインタフェースの実装クラスHashSetでSetインタフェースの方法を説明する
         //2.setインタフェースの実装クラスのオブジェクト（Setインタフェースオブジェクト）は、重複する要素を格納することができず、nullを追加することができます
         //3.setインタフェースオブジェクト格納データは無秩序である（すなわち、追加する順序と取り出す順序が一致しない）
        Set set = new HashSet();
        set.add("quanyu");
        set.add("junyu");
        set.add("quanyu");
        set.add("zeahye");
        set.add(null);
        set.add(null);
        for (int i = 0; i < 10; i++) {
            System.out.println("set=" + set);
        }

        //遍历
        //方式1：使用迭代器
        Iterator iterator = set. iterator(); while (iterator. hasNext()) {
            Object obj = iterator. next(); System. out. println("obj=" + obj);
        }

        //方式2：增强for
        for (Object o : set) {
            System.out.println("o=" + o);

        }


    }

}
