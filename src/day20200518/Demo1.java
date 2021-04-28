package day20200518;

import java.lang.invoke.MethodType;

public class Demo1 {
    public static void main(String[] args) {
        String a = "a";
        System.out.println("a hashcode:" + a.hashCode());
        MethodType.methodType(Integer.class, String.class);

        test1("a", "b");
    }

    public static void test1(String... strs) {
        System.out.println(strs[0] + strs[1]);
    }

    public static String[] test() {
        return new String[]{"a", "b", "c"};
    }
}
