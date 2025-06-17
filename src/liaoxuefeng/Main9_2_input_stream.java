package liaoxuefeng;

import java.io.FileInputStream;
import java.io.InputStream;

public class Main9_2_input_stream {
    public static void main(String[] args) throws Exception {
        // try (ByteArrayInputStream input = new ByteArrayInputStream("测试1".getBytes()))
        // {
        try (InputStream input = new FileInputStream(
                "/Users/leijianxiong/work/java/learn-java/src/liaoxuefeng/Main9_2_input_stream.java")) {
            var res = readAsString(input);
            System.out.println(res);
        }
    }

    public static String readAsString(InputStream input) throws Exception {
        StringBuffer res = new StringBuffer();
        byte[] b = new byte[1024];
        int times = 0;
        int n;
        while ((n = input.read(b)) != -1) {
            times += 1;
            System.out.println(String.format("read %d times, n = %d", times, n));
            res.append(new String(b, 0, n));
        }
        return res.toString();
    }
}
