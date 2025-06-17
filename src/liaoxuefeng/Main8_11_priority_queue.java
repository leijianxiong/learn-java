package liaoxuefeng;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main8_11_priority_queue {
    public static void main(String[] args) {
        Queue<User> q = new PriorityQueue<>(new UserComparator());
        // 添加3个元素到队列:
        q.offer(new User("Bob", "A1"));
        q.offer(new User("Alice", "A2"));
        q.offer(new User("Boss", "V1"));
        q.offer(new User("User4", "A10"));
        q.offer(new User("User5", "V2"));
        q.offer(new User("User6", "V10"));

        while (true) {
            User u = q.poll();
            System.err.println(u);
            if (u == null) {
                break;
            }
        }
        // System.out.println(q.poll()); // Boss/V1
        // System.out.println(q.poll()); // Bob/A1
        // System.out.println(q.poll()); // Alice/A2
        // System.out.println(q.poll()); // null,因为队列为空
    }
}

class UserComparator implements Comparator<User> {
    public int compare(User u1, User u2) {
        if (u1.number.charAt(0) == u2.number.charAt(0)) {
            // 如果两人的号都是A开头或者都是V开头,比较号的大小:
            // return u1.number.compareTo(u2.number);
            // FIX: 使用数字来比较
            return Integer.valueOf(u1.number.substring(1)).compareTo(Integer.valueOf(u2.number.substring(1)));

        }
        if (u1.number.charAt(0) == 'V') {
            // u1的号码是V开头,优先级高:
            return -1;
        } else {
            return 1;
        }
    }
}

class User {
    public final String name;
    public final String number;

    public User(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return name + "/" + number;
    }
}