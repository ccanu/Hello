package Set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {
        //2.HashSetはnullを保存できますが、1つのnullしかありません。つまり、要素は重複できません
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);

    }
}
