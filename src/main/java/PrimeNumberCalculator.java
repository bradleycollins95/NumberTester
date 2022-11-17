import java.util.Scanner;

/**
 * <pre>
 * Class that allows the user to check whether a number is prime
 *
 * @author 20108508
 * </pre>
 */

public class PrimeNumberCalculator {

    /**
     * <pre>
     * main method checks an input number to determine whether it is a Prime number or not
     * @param num user number {@code num}
     * @return true - if num is prime
     * </pre>
     */
    public static boolean isPrime(int num) {
        //TODO deal with the edge cases

        // if the number returns more than 0 on division in its remainder, it's not a Prime
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * <pre>
     * method provides all prime factors of an input number
     * @param n
     * @return String prime {@code prime}
     * </pre>
     */
    public static String getUniquePrimeFactorization(int n) {
        StringBuilder prime = new StringBuilder();
        // if the number returns more than 0 on division in its remainder, it's not a Prime
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                prime.append(i).append("*"); // if the number is not a Prime, append * to each factor
                n = n / i;
            }
        }
        return prime.toString();
    }


}