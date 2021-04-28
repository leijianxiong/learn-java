package t20190903;

import java.io.*;

public class testFile {
    public static void main(String[] args) {
        /*
        创建文件
         */
        File f = new File("/Users/jianxiong/work/tmp/abc");
        try (BufferedReader r = new BufferedReader(new FileReader(f));
             PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("/Users/jianxiong/work/tmp/abc-bak"))) ) {
            String line = r.readLine();
            out.println(line+" by abc again2 \n");
            //out.write(line + " by abc again \n");
            System.out.println(line);
        } catch (IOException e) {

            System.out.println("test");
        }
    }
}
