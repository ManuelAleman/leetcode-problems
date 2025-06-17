//LeetCode Problem: https://leetcode.com/problems/maximum-average-subarray-i/
package leetcode75.sliding_window;

public class MaximunAvgSubarrayI{
    public static double findMaxAverage(int[] nums, int k) {
        
        double curr=0;
        for(int i=0; i<k; i++){
            curr+=nums[i];
        }

        double max = curr;
        for(int i=k; i<nums.length; i++){
            curr += nums[i] - nums[i-k];
            if(curr > max){
                max = curr;
            }
        }
        
        return max/k;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));      //12.75000
        System.out.println(findMaxAverage(new int[]{5}, 1));                    //5.00000 
    }
}