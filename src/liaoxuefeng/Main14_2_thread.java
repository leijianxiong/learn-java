package liaoxuefeng;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 *
 * @author liaoxuefeng
 */
public class Main14_2_thread {

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main: running...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }

}

class Thread1 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread-1: running...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}

class Thread2 extends Thread {

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread-2: running...");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
            }
        }
    }
}
