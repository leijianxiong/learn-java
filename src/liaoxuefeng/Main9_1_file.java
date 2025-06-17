package liaoxuefeng;

import java.io.File;

//列出文件和目录

public class Main9_1_file {
    public static void main(String[] args) {
        String dir = "";
        for (String arg : args) {
            System.out.println(arg);
            if (arg.startsWith("-dir")) {
                dir = arg.substring(5); // -dir=
            }
        }

        System.out.println("dir = " + dir);
        if (dir != "") {
            File fd = new File(dir);
            listDirFiles(fd);
        }
    }

    // 提供一个目录，打印目录里的文件，如果遇到的是目录，则递归调用
    static void listDirFiles(File dir) {
        for (File f : dir.listFiles()) {
            if (f.isDirectory()) {
                System.err.println(f.getAbsolutePath() + "/");
                listDirFiles(f);
            } else {
                System.err.println(f.getAbsolutePath());
            }
        }
    }
}
