//LeetCode Problem: https://leetcode.com/problems/product-of-array-except-self/
package leetcode75.array_string;

import java.util.Arrays;

public class ProductArrayExceptSelf{
    public static int[] productExceptSelf(int[] nums) {
        int[] product = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            product[i] = 1;
        }
        int left = 1;
        for(int i=0; i<nums.length; i++){
            product[i] *= left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            product[i] *= right;
            right *= nums[i];
        }
        return product;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));         //[24,12,8,6]
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1,1,0,-3,3})));     //[0,0,9,0,0]
    }
}