package liaoxuefeng;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main8_13_stack {
    public static void main(String[] args) {
        String hex = toHex(12500);
        if (hex.equalsIgnoreCase("30D4")) {
            System.out.println("测试通过");
        } else {
            System.out.println("测试失败");
        }
    }

    static String toHex(int n) {
        // 准备一个栈
        Deque<String> stack = new ArrayDeque<>();

        while (true) {
            int divn = n / 16;
            int mod = n % 16;
            // 将余数0到15换成十六进制的字符表示
            stack.push(Integer.toHexString(mod));
            // 将余数压入栈
            // 如果除数是0则退出
            System.err.println(String.format("divd=%d, mod=%d", divn, mod));
            if (divn == 0) {
                break;
            }
            n = divn;
        }

        // 依次弹出
        String res = "";
        for (String s : stack) {
            res += s;
        }
        // while (true) {
        // try {
        // res += stack.pop();
        // } catch (Exception e) {
        // // TODO: handle exception
        // break;
        // }
        // }

        return res;
    }
}
