package liaoxuefeng;

import java.util.Scanner;

public class Main2_4_1_input_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.print("Input prev score: ");
        int prevScore = scanner.nextInt();
        System.err.print("Input current score: ");
        int score = scanner.nextInt();
        scanner.close();

        float res = ((float) score / (float) prevScore - 1) * 100;
        if (res > 0) {
            System.err.printf("提高了%.2f%%\n", res);
        } else {
            res = Math.abs(res); // 取绝对值
            System.err.printf("降低了%.2f%%\n", res);
        }

    }
}
