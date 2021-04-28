package day20200415;

/*
Java技术手册：第6版 2.9.2
 */
public class Demo1 {
    public static void main(String[] args) {
        Point q = new Point(3.0, 4.5); // 一个x坐标为3的点
        changeReference(q); // 打印3，2，1，而且修改了这个Point对象
        System.out.print("q.x: ");
        System.out.println(q.x); // 现在，q的x坐标是0!
    }

    public static void changeReference(Point p) {
        while(p.x > 0) {
            System.out.println(p.x--);
        }

        Point p2 = new Point(1, 2);
        System.out.println("p=p2");
        p = p2;

        System.out.printf("now p.x:%f\n", p.x);
    }
}
