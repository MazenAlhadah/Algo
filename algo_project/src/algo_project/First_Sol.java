package algo_project;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MazenAlhadah
 */
public class First_Sol {
    

    // With For Loop
    public static int WithForLoops(int[] A) {
        int n = A.length;
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int product = A[i] * A[j] * A[k];
                    maxProduct = Math.max(maxProduct, product);
                }
            }
        }
            return maxProduct;
    }
}
