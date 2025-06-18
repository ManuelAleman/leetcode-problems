//LeetCode Problem: https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
package leetcode75.sliding_window;

public class LongestSubarrayOf1AfterDel {
    public static int longestSubarray(int[] nums) {
        int left=0;
        int cont=0;
        int ans=0;

        for(int right=0; right<nums.length; right++){
            if(nums[right] == 0) cont++;

            while(cont > 1) {
                if(nums[left]==0) cont--;
                left++;
            }
            ans = Math.max(ans, right-left+1);
            
        }
        return ans-1;
    }


    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,1,0,1}));
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        System.out.println(longestSubarray(new int[]{1,1,1}));
    }
}
