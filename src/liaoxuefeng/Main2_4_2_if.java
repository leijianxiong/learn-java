package liaoxuefeng;

public class Main2_4_2_if {
    public static void main(String[] args) {
        // System.err.println("bmi: " + bmi(60, (float) 1.8));
        // System.err.println("bmi: " + bmi(48, (float) 1.58));

        float weight = 60; // unit kg
        float high = 1.8f; // unit m
        float res = bmi(weight, high);
        if (res < 18.5) {
            System.err.println("过轻：低于18.5: " + res);
        } else if (res < 25) {
            System.err.println("正常：18.5 ~ 25: " + res);
        } else if (res < 28) {
            System.out.println("过重：25 ~ 28: " + res);
        } else if (res < 32) {
            System.out.println("肥胖：28 ~ 32: " + res);
        } else {
            System.err.println("非常肥胖：高于32: " + res);
        }
    }

    public static float bmi(float weight, float high) {
        return weight / (high * high);
    }
}
