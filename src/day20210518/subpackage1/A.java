package day20210518.subpackage1;

import day20210518.subpackage2.B;

public class A {
    public void calla() {
        System.out.println("A->B");
        callb();
    }

    public void callb() {
        System.out.println("B->Main");
        B b = new B();
        b.callMain();
    }
}
