package t20190905;

import java.util.logging.Logger;

public class testGeneric2 {
    private static final Logger logger = Logger.getLogger(testGeneric2.class.toString());

    class A {
        String a;

        public A(String a) {
            this.a = a;
        }
        public void showA() {
            System.out.println("A a: " + a);
        }
    }

    public static void main(String[] args) {
        A a1 = new testGeneric2().new A("abc");
        a1.showA();
    }
}

