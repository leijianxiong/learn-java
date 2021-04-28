package t20190830;

import java.util.Collection;
import java.util.HashSet;

/**
 * Test
 */
public class Test {
    public static void main(String[] args) {
        /*
        测试集合
        */

        Collection<String> a = new HashSet<>();
        a.add("a");
        a.add("b");

        System.out.println(a);
        //System.out.println(a.size());
//
//        Object[] o = a.toArray();
//
        String[] b = a.toArray(new String[a.size()]);
        System.out.println(b.length + "" + b[0] + "" + b[1]);
//
        String[] c = a.toArray(new String[0]);
        System.out.println(c.length + "" + c[0] + "" + c[1]);
    }
}
