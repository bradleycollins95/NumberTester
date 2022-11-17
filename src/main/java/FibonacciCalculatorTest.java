import org.example.FibonacciCalculator;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciCalculatorTest {

    @DisplayName("")
    @org.junit.jupiter.api.Test
    void isFibonacciNumber() {
        assertTrue(FibonacciCalculator.isFibonacciNumber(987));
        assertTrue(FibonacciCalculator.isFibonacciNumber(337));
        assertTrue(FibonacciCalculator.isFibonacciNumber(13));
        assertTrue(FibonacciCalculator.isFibonacciNumber(2));
        assertTrue(FibonacciCalculator.isFibonacciNumber(46368));
        assertTrue(FibonacciCalculator.isFibonacciNumber(75025));
        assertTrue(FibonacciCalculator.isFibonacciNumber(0));
        assertFalse(FibonacciCalculator.isFibonacciNumber(-13));
        assertFalse(FibonacciCalculator.isFibonacciNumber(75000));
        assertFalse(FibonacciCalculator.isFibonacciNumber(998));
        assertFalse(FibonacciCalculator.isFibonacciNumber(3434));
    }

    @DisplayName("")
    @org.junit.jupiter.api.Test
    void getFibonacciNumber() {
        assertEquals(701408733, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(9227465, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(121393, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(8, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(89, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(610, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(0, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(1, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(1, FibonacciCalculator.getFibonacciNumber(44));
        assertEquals(0, FibonacciCalculator.getFibonacciNumber(44));
    }
}
