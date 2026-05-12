package algo_project;

import java.util.Scanner;

/**
 *
 * @author MazenAlhadah
 */
public class Algo_project {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("Array must have at least 3 elements.");
            return;
        }

        int[] A = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        long startTime1 = System.nanoTime();
        System.out.println("With Loops Result: " + First_Sol.WithForLoops(A));
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;
        System.out.println("Execution Time = " + executionTime1 + " ns");
        System.out.println("-------------------------------------");

        long startTime2 = System.nanoTime();
        System.out.println("Sorting Result: " + Sec_Sol.WithSorting(A));
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;
        System.out.println("Execution Time = " + executionTime2 + " ns");
        System.out.println("-------------------------------------");
        
        long startTime3 = System.nanoTime();
        System.out.println("Linear Tracking Result: " + Third_sol.WithTring(A));
        long endTime3 = System.nanoTime();
        long executionTime3 = endTime3 - startTime3;
        System.out.println("Execution Time = " + executionTime3 + " ns");
        System.out.println("-------------------------------------");
        
        
        long startTime4 = System.nanoTime();
        System.out.println("With Recursion: " + recursiveAlgo.maxProduct(A));
        long endTime4 = System.nanoTime();
        long executionTime4 = endTime4 - startTime4;
        System.out.println("Execution Time = " + executionTime4 + " ns");
        System.out.println("-------------------------------------");
        
    }
}
    
