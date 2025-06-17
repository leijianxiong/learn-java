package liaoxuefeng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

//cd /Users/leijianxiong/work/java/learn-java ; /usr/bin/env /Library/Java/JavaVirtualMachines/jdk-23.jdk/Contents/Home/bin/java --enable-preview -XX:+ShowCodeDetailsInExceptionMessages -cp /Users/leijianxiong/Library/Application\ Support/Cursor/User/workspaceStorage/55db97b039273623674363c328e33cd8/redhat.java/jdt_ws/learn-java_44833398/bin liaoxuefeng.Main9_3_output_steram /Users/leijianxiong/work/java/learn-java/src/liaoxuefeng/Main9_2_input_stream.java /Users/leijianxiong/work/java/learn-java/src/liaoxuefeng/Main9_3_output_stream_copied.txt
public class Main9_3_output_steram {
    public static void main(String[] args) throws Exception {
        if (args.length < 1) {
            System.err.println("src required");
            return;
        } else if (args.length < 2) {
            System.err.println("dst required");
            return;
        }

        String src = args[0];
        String dst = args[1];
        copyFile(src, dst);
        // 读取dst文件以确认copy情况
        System.out.println("copied, content = \n");
        System.out.println(readAllFileContent(dst));
    }

    public static void copyFile(String src, String dst) throws Exception {
        try (InputStream input = new FileInputStream(src);
                OutputStream output = new FileOutputStream(dst)) {
            input.transferTo(output);
        }
    }

    public static String readAllFileContent(String filePath) throws Exception {
        return Files.readString(Paths.get(filePath)); // 读取整个文件内容
    }
}
