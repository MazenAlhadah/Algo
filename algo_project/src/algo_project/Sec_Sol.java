package algo_project;


public class Sec_Sol {

    public static void mergeSort(int[] A, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid + 1, right);
            merge(A, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = A[left + i];
        for (int i = 0; i < n2; i++)
            R[i] = A[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                A[k++] = L[i++];
            else
                A[k++] = R[j++];
        }

        while (i < n1)
            A[k++] = L[i++];
        while (j < n2)
            A[k++] = R[j++];
    }

    public static long WithSorting(int[] A) {
        mergeSort(A, 0, A.length - 1);
        int n = A.length;

        long option1 = (long) A[n - 1] * A[n - 2] * A[n - 3];
        long option2 = (long) A[0] * A[1] * A[n - 1];

        return Math.max(option1, option2);
    }
}
