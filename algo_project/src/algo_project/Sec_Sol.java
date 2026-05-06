/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algo_project;

import java.util.Arrays;

/**
 *
 * @author MazenAlhadah
 */
public class Sec_Sol {
    
    // With Solting
    public static long WithSorting(int[] A) {
        Arrays.sort(A);
        int n = A.length;

        long option1 = A[n - 1] * A[n - 2] * A[n - 3];
        long option2 = A[0] * A[1] * A[n - 1];

        return Math.max(option1, option2);
    }
}
