//LeetCode Problem: https://leetcode.com/problems/search-insert-position/
package easy.arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int accPos = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) return i;

            if(nums[i] < target && nums[i] <= nums[accPos]){
                accPos = i+1;
            }
        }
        return accPos;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6}, 5));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 2));
        System.out.println(searchInsert(new int[]{1,3,5,6}, 7));
        System.out.println(searchInsert(new int[]{-1,3,5,6}, 0));
    }
}
