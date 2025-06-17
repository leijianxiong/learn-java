package liaoxuefeng;

// 一元二次方程
public class Main2_3_4 {
    public static void main(String[] args) {
        double a = 1.0;
        double b = 3.0;
        double c = -4.0;
        // 求平方根可用 Math.sqrt():
        // System.out.println(Math.sqrt(2)); ==> 1.414
        double r1 = result1(a, b, c);
        double r2 = result2(a, b, c);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1 == 1 && r2 == -4 ? "测试通过" : "测试失败");
    }
    public static double result1(double a, double b, double c) {
        return (-b + Math.sqrt(b*b - 4 * a * c)) / (2 * a);
    }

    public static double result2(double a, double b, double c) {
        return (-b - Math.sqrt(b*b - 4 * a * c)) / (2 * a);
    }
}
