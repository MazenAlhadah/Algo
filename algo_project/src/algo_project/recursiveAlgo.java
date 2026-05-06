/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo_project;

/**
 *
 * @author MazenAlhadah
 */
public class recursiveAlgo {
    public static long choose(int[] A, int n, int start, int count, long product) {

        if (count == 3)
            return product;

        int remaining = 3 - count;

        if (n - start < remaining)
            return Long.MIN_VALUE;

        long inc = choose(A, n, start + 1, count + 1,
                product * A[start]);

        long exc = choose(A, n, start + 1, count, product);

        return Math.max(inc, exc);
    }

    public static long maxProductOfThree_recursion(int[] A, int n) {
        return choose(A, n, 0, 0, 1);
    }

}
