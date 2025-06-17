package liaoxuefeng;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main8_2_list {
    public static void main(String[] args) {
        // 构造从start到end的序列：
        final int start = 10;
        final int end = 20;
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        // 洗牌算法shuffle可以随机交换List中的元素位置:
        Collections.shuffle(list);
        System.out.println("shuffle list: " + list.toString());
        // 随机删除List中的一个元素:
        int removed = list.remove((int) (Math.random() * list.size()));
        // int removed = list.remove(0);
        // int removed = list.remove(10);
        int found = findMissingNumber(start, end, list);
        System.out.println("after find list: " + list.toString());
        System.out.println("missing number: " + found);
        System.out.println(removed == found ? "测试成功" : "测试失败");
    }

    // 10 11 12 13 14 15 16 17 18 19 20
    // 用后一个-1 等于前一个则表示是顺序的，不等于 那么这个数就是丢失的数
    // 不太对
    // 可能是两边的丢了
    static int findMissingNumber(int start, int end, List<Integer> list) {
        // 对list排序
        Collections.sort(list);

        // 先检查两遍的
        if (!list.contains(start)) {
            return start;
        }
        if (!list.contains(end)) {
            return end;
        }

        for (int i = 1; i < list.size(); i++) {
            int n = list.get(i);
            int prev = list.get(i - 1);
            if (n - 1 != prev) {
                return n - 1;
            }
        }

        return 0;
    }
}