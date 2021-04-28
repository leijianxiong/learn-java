package t20190903;

import java.util.*;
import java.util.stream.Collectors;

public class testFunction {
    public static void main(String[] args) {
        /*
        测试函数表达式
         */
        String[] c = {"one", "two", "three"};
        List<String> cats = new ArrayList<>(Arrays.asList(c));

        List<Integer> namesLength = cats.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(namesLength);

        String a = "one two three";
        String[] as = a.split(" +");
        System.out.println(Arrays.toString(as));
        String[][] deepArray1 = new String[][]{{"a1", "b1"}, {"a2", "b2"}};
        System.out.println(Arrays.toString(deepArray1));
        System.out.println(Arrays.deepToString(deepArray1));

        //String[][] deepArray = new String[][]{{"John", "Mary"}, {"Alice", "Bob"}};
    }
}
