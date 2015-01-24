package Chapter_20;

import java.math.BigInteger;

/**
 * (Game: solution ratio for 24-point game)
 * When you pick four cards from a deck of 52 cards for the 24-point game introduced
 * in Programming Exercise 20.13, the four cards may not have a 24-point solution.
 * What is the number of all possible picks of four cards from 52 cards? Among all
 * possible picks, how many of them have 24-point solutions? What is the success
 * ratio—that is, (number of picks with solutions)/ (number of all possible picks
 * of four cards)? Write a program to find these answers.
 *
 * Created by Luiz Arantes Sa on 1/23/15.
 */
public class Exercise_19 {

    public static void main(String[] args) {

        // Possible card combinations
        System.out.println("Possible 52 cards permutation: " + factorial(new BigInteger("52"), new BigInteger("4")));

        // Possible permutations
        System.out.println("Possible number permutation: " + factorial(13, 4));

    }

    /**
     * n! / (n - r)!
     *
     * @param n Number of things to choose from
     * @param r Number of things chosen
     * @return Number of permutations
     */
    private static long factorial(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    /**
     * n!
     * @param n start value
     * @return Factorial value of n
     */
    private static long factorial(int n) {
        if (n == 1)
            return 1;
        else
            return n * factorial(n - 1);

    }

    /**
     * n! / (n - r)!
     *
     * @param n Number of things to choose from
     * @param r Number of things chosen
     * @return Number of permutations
     */
    private static BigInteger factorial(BigInteger n, BigInteger r) {
        return factorial(n).divide(factorial(n.subtract(r)));
    }

    /**
     * n!
     * @param n start value
     * @return Factorial value of n
     */
    private static BigInteger factorial(BigInteger n) {
        if (n.compareTo(BigInteger.ONE) == 0)
            return BigInteger.ONE;
        else
            return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

}