package day20210518.subpackage2;

import day20210518.TestPackageImportCycle;

public class B {
    public void callMain() {
        TestPackageImportCycle cycle = new TestPackageImportCycle();
        cycle.callByB();
    }
}
