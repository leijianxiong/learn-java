package liaoxuefeng;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main12_4_regex {
    public static void main(String[] args) {
        String s1 = "23:01:59";
        Pattern p = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})");
        Matcher matcher = p.matcher(s1);
        boolean matches = matcher.matches();
        System.out.println("matches " + matches);
        if (matches) {
            String h = matcher.group(1);
            String m = matcher.group(2);
            String s = matcher.group(3);
            System.out.println("h=" + h);
            System.out.println("m=" + m);
            System.out.println("s=" + s);
        }
    }
}
