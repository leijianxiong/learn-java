package day20200415;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        // 创建一个List集合
        List numbers = new ArrayList();
// 存储一个包装类表示的基本值
        numbers.add(new Integer(-1));
// 取出这个基本值
        //int i = ((Integer)numbers.get(0)).intValue();
        int i = ((Integer) numbers.get(0)).intValue();
        System.out.printf("i:%d\n", i);
    }
}
