package day20210518;

import day20210518.subpackage1.A;

/**
 * P->A->B->P Successes!
 */
public class TestPackageImportCycle {
    public static void main(String[] args) {
        System.out.println("Main->A");
        A a = new A();
        a.calla();
    }

    public void callByB() {
        System.out.println("here is Main.callByB");
    }
}
