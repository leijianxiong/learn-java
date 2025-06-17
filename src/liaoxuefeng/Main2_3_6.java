package liaoxuefeng;

public class Main2_3_6 {
    public static void main(String[] args) {
        String s = "hello";
        String t = s;
        s = "world";
        System.err.println(t);
    }
}
