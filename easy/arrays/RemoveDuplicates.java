// LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
package easy.arrays;

public class RemoveDuplicates {
     public static int removeDuplicates(int[] nums) {
        int j=0;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }


    public static void main(String []args){
        int nums[] = new int[]{1,1,2};
        int nums2[] = new int[]{0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(nums));

        System.out.println(removeDuplicates(nums2));
    }
}
