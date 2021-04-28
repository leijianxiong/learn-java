package t20190902;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class testList {
    public static void main(String[] args) {
        //创建两个集合
        List<String> l = new ArrayList<>(Arrays.asList(args));
        List<String> words = new ArrayList<>(Arrays.asList("hello", "world"));

        String first = l.get(0);
        String last = l.get(l.size() - 1);
        l.set(0, last);

        l.add(first);
        l.add(0, first);
        l.addAll(words);
        l.addAll(1, words);

        System.out.println(l);

        List<String> sub = l.subList(1, 3);
        System.out.println(sub);
        sub.set(0, "hi");
        System.out.println(l);
        System.out.println(sub);
    }
}
