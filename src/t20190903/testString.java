package t20190903;

public class testString {
    public static void main(String[] args) {
        String s1 = "AB";
        String s2 = "CD";

        String s3 = s1;
        System.out.println(s1.equals(s3));

        s3 = s1 + s2;
        System.out.println(s1.equals(s3));
        System.out.println(s1);
        System.out.println(s3);
    }
}
