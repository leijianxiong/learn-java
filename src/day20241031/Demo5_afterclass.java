package day20241031;

//第5节课后计算

public class Demo5_afterclass {

    public static void main(String[] args) {
        int[] arr1 = {2,3,1};
        System.out.println("convert arr1 to " + convert(arr1));
    }

    public static int convert(int[] arr1) {
        int len = arr1.length;

        int res = 0;
        // int[] res = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            // System.out.println("arr1: "+arr1[i]+" to res "+(len - (i+1)));
            res += arr1[i] * Math.pow(10, i);
            // System.out.println("res = "+ res);
            // res[len - (i+1)] = arr1[i];
        }

        return res;
    }
}
