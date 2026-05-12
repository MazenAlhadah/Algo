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
    static long ans = Long.MIN_VALUE;

    static void solve(int[] nums, int start, int count, long product) {

        if (count == 3) {
            ans = Math.max(ans, product);
            return;
        }

        for (int i = start; i < nums.length; i++) {
            solve(nums, i + 1, count + 1, product * nums[i]);
        }
    }

    static long maxProduct(int[] nums) {

        solve(nums, 0, 0, 1);

        return ans;
    }
}
