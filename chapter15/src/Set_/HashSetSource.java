package Set_;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class HashSetSource {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet. add("java");
        hashSet. add("php");
        hashSet. add("java");
        System. out. println("set="+ hashSet);

        /*
        1.执行 HashSet（public HashSet（）{
          map = new HashMap<>（）;
          }
          2.执行 add（public boolean add（E e）{//e ="java"
          return map.put（e，PRESENT）==null；
          }
          3.执行 put（）
          public V put（K key，V value）{
           return putVat（hash（key），key，value，false，true）；
         */

    }
}
