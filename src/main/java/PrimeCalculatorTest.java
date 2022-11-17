import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class PrimeCalculatorTest {

    @DisplayName("")
    @org.junit.jupiter.api.Test
    void isPrime() {
        assertTrue(PrimeNumberCalculator.isPrime(9901));
        assertTrue(PrimeNumberCalculator.isPrime(85369));
        assertTrue(PrimeNumberCalculator.isPrime(896573));
        assertTrue(PrimeNumberCalculator.isPrime(41));
        assertTrue(PrimeNumberCalculator.isPrime(2));
        assertTrue(PrimeNumberCalculator.isPrime(4));
        assertFalse(PrimeNumberCalculator.isPrime(-4));
        assertFalse(PrimeNumberCalculator.isPrime(7474));
        assertFalse(PrimeNumberCalculator.isPrime(999924));
        assertFalse(PrimeNumberCalculator.isPrime(83968));
        assertFalse(PrimeNumberCalculator.isPrime(0));
    }

    @DisplayName("")
    @org.junit.jupiter.api.Test
    void getUniquePrimeFactorization() {
        assertEquals("2*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(50));
        assertEquals("2*2*2*5*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(1000));
        assertEquals("5*197", PrimeNumberCalculator.getUniquePrimeFactorization(985));
        assertEquals("701", PrimeNumberCalculator.getUniquePrimeFactorization(701));
        assertEquals("2*2*2*2*3*3*5", PrimeNumberCalculator.getUniquePrimeFactorization(720));
        assertEquals("", PrimeNumberCalculator.getUniquePrimeFactorization(-548));
        assertEquals("17*17", PrimeNumberCalculator.getUniquePrimeFactorization(289));
        assertEquals("2*2*3*5*5", PrimeNumberCalculator.getUniquePrimeFactorization(300));
        assertEquals("2*3", PrimeNumberCalculator.getUniquePrimeFactorization(6));
        assertEquals("7*17*17*281", PrimeNumberCalculator.getUniquePrimeFactorization(568463));
        assertEquals("2*2*255253", PrimeNumberCalculator.getUniquePrimeFactorization(1021012));
        assertEquals("3*3*5*5*5*7*7*157", PrimeNumberCalculator.getUniquePrimeFactorization(8654625));
        assertEquals("", PrimeNumberCalculator.getUniquePrimeFactorization(0));
        ;
    }
}