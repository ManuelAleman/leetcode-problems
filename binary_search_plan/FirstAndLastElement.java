//LeetCode Problem: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package binary_search_plan;

import java.util.Arrays;

public class FirstAndLastElement {

    public static int[] searchRange(int[] nums, int target) {
        int l = binarySearch(nums, target, true);
        int r = binarySearch(nums, target, false);
        return new int[]{l,r};   
    }

    public static int binarySearch(int[] nums, int target, boolean isLeft){
        int low = 0;
        int high = nums.length-1;
        int id=-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(nums[mid] < target){
                low = mid + 1;
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                id = mid;
                if(isLeft){
                    high = mid -1;
                }
                else{
                    low = mid+1;
                }
            }
        }

        return id;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));   //[3,4]
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));   //[-1,-1]
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));   //[-1,-1]
        System.out.println(Arrays.toString(searchRange(new int[]{1}, 1)));  //[0,0]
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2))); //[0,1]
    }    
}
