package liaoxuefeng;

import java.util.Map;

public class Main12_6_regex {
    public static void main(String[] args) {
        String template = "Hello, ${name}! You are learning ${lang}!";
        Map<String, String> m = Map.of("name", "Bob", "lang", "Java");
        for (String key : m.keySet()) {
            template = template.replaceAll("\\$\\{" + key + "\\}", m.get(key));
        }
        System.out.println("template=" + template);
    }
}
