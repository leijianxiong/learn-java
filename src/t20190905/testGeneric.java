package t20190905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class testGeneric {
    private static final Logger logger = Logger.getLogger(testGeneric.class.toString());

    class A {
        String a;

        public A(String a) {
            this.a = a;
        }
        public void showA() {
            System.out.println("A a: " + a);
        }
    }

    class D {
        public D() {

        }
        public A dm1() {
            System.out.println("dm1 called");
            return new A("a1-value");
        }
    }

    public static void main(String[] args) {
        D d = new testGeneric().new D();
        A a1 = d.dm1();
        a1.showA();
    }
}
