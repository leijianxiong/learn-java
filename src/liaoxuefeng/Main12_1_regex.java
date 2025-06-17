package liaoxuefeng;

import java.util.List;

public class Main12_1_regex {
    public static void main(String[] args) {
        String regex = "20\\d\\d";
        System.err.println("2019".matches(regex));
        System.err.println("2119".matches(regex));

        String re1 = "java\\d"; // 对应的正则是java\d
        System.out.println("java9".matches(re1));
        System.out.println("java10".matches(re1));
        System.out.println("javac".matches(re1));

        String re2 = "java\\D";
        System.out.println("javax".matches(re2));
        System.out.println("java#".matches(re2));
        System.out.println("java5".matches(re2));

        String re = "\\d{3,4}-\\d{7,8}";
        for (String s : List.of("010-12345678", "020-9999999", "0755-7654321")) {
            if (!s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }
        for (String s : List.of("010 12345678", "A20-9999999", "0755-7654.321")) {
            if (s.matches(re)) {
                System.out.println("测试失败: " + s);
                return;
            }
        }
        System.out.println("测试成功!");

        String re3 = "learn\\s(java|php|go|Java|Php|Go)";
        System.out.println("learn java".matches(re3));
        System.out.println("learn Java".matches(re3));
        System.out.println("learn php".matches(re3));
        System.out.println("learn Go".matches(re3));
    }
}
