package liaoxuefeng.Main11_unit_test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    void testFact() {
        System.out.println("testFact start");
        long result = Factorial.fact(1);
        System.out.println("testFact Result: " + result);
        assertEquals(1L, result);

        assertEquals(2L, Factorial.fact(2));
        assertEquals(6L, Factorial.fact(3));
        assertEquals(3628800L, Factorial.fact(10));
        assertEquals(2432902008176640000L, Factorial.fact(20));
    }

    @Test
    void testFact2() {
        System.out.println("testFact2 start");
        long result = Factorial.fact(2);
        System.out.println("testFact2 Result: " + result);
        assertEquals(2L, result);

        // assertEquals(2L, Factorial.fact(2));
        // assertEquals(6L, Factorial.fact(3));
        // assertEquals(3628800L, Factorial.fact(10));
        // assertEquals(2432902008176640000L, Factorial.fact(20));
    }
}