package t20190909;

import java.util.Random;

public class testRandom {
    public static void main(String[] args) {
        Random r1 = new Random(100);
        Random r2 = new Random(100);
        for (int i = 0; i < 10; i++) {
//            System.out.println("r1 next int:"+r1.nextInt(200)+"; r2 next int:"+r2.nextInt(200));
        }

        //20 - 30
        int min = 20;
        int max = 30;
        for (int i = 0; i < 20; i++) {
            int result = (int) ((max - min) * Math.random() + min);
            System.out.println("20-30: "+result);
        }
    }
}
