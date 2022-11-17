package org.example;

import java.util.Scanner;

/**
 * <pre>
 * Class that allows someone to check and generate Fibonacci numbers
 * Use Fibonacci numbers, commonly denoted Fn, form a sequence, called the
 * Fibonacci sequence, such that each number is the sum of the two proceeding
 * ones, starting from 0 and 1.
 *
 * That is:
 * F_0 = 0 and F_1 = 1
 * AND
 * F_N = F_N-1 + F_N-2
 *
 * @author 20108508
 * </pre>
 */

public class FibonacciCalculator {

    /**
     * <pre>
     * Check to see if integer passed in is a Fibonacci number.
     * Warning - Fibonacci numbers get large fast so be cautious of
     * size of number int
     *
     * @param n integer to test
     * @return true if number is a Fibonacci number {@code getFibonacciNumber}
     * </pre>
     */
    public static boolean isFibonacciNumber(int n) {
        int n1 = 0;
        int n2 = 1;

        do {
            int n3 = n1;
            n1 = n2;
            n2 = n1 + n3;
        } while (n2 < n); // check until number is bigger than fibonacci number

        return n2 == n;
    }

    /**
     * <pre>
     * Get the nth number in the Fibonacci sequence.
     * @param n the position in the Fibonacci sequence
     * @return value of the nth Fibonacci number
     * </pre>
     */
    public static int getFibonacciNumber(int n) {
        // recursion
        if (n <= 1)
            return n;
        else
            // calling and calculating the value given for n where n-1 + n-2
            return getFibonacciNumber(n-1) + getFibonacciNumber(n-2);
    }

}
