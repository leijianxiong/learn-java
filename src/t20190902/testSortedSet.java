package t20190902;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class testSortedSet {
    public static void main(String[] args) {
        SortedSet<String> s = new TreeSet<>(Arrays.asList(args));
        System.out.println("s: " + s);

        //看看迭代时顺序
        for (String word: s) {
            System.out.println(word);
        }
        /*
adfsadf
erwe
fadf
foturwe

         */

        //特定元素
        System.out.println(s.first());
        System.out.println(s.last());
        System.out.println(s.tailSet(s.first()));
        System.out.println(s.tailSet(s.first()+'\0'));

        // 除最后一个元素之外的其他所有元素 SortedSet<String> head = s.headSet(last); System.out.println(head);
        System.out.println(s.headSet(s.last()));

        SortedSet<String> sub = s.subSet(s.first() + '\0', s.last());
        System.out.println(sub);
    }
}
