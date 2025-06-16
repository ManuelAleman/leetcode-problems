//LeetCode Problem: https://leetcode.com/problems/max-number-of-k-sum-pairs/
package leetcode75.two_pointers;

import java.util.Arrays;

public class MaxNumberOfKSum {
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cont = 0;
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            if (nums[low] + nums[high] == k) {
                cont++;
                low++;
                high--;
            } else if(nums[low] + nums[high] > k){
                high--;
            }else{
                low++;
            }

        }
        return cont;
    }

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[] { 1, 2, 3, 4 }, 5));                         //2
        System.out.println(maxOperations(new int[] { 3, 1, 3, 4, 3 }, 6));                      //1
        System.out.println(maxOperations(new int[]{4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4}, 2));   //2
        System.out.println(maxOperations(new int[]{2,2,2,3,1,1,4,1}, 4));                       //2
    }
}