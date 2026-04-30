package algo_project;

import java.util.Arrays;
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

        System.out.println("WithForLoops Result: " + First_Sol.WithForLoops(A));
        System.out.println("Sorting Result: " + Sec_Sol.WithSorting(A));
        System.out.println("WithTring Result: " + Third_sol.WithTring(A));
    }
}
    
