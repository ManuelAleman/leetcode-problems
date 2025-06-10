//LeetCode Problem: https://leetcode.com/problems/binary-search/
package binary_search_plan;
public class BinarySearch {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high - low) /2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 9));
        System.out.println(search(new int[]{-1,0,3,5,9,12}, 2));
    }
}