//LeetCode Problem: https://leetcode.com/problems/move-zeroes/
package leetcode75.two_pointers;


public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int write = 0;

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write++] = nums[read];
            }
        }

        while (write < nums.length) {
            nums[write++] = 0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[] { 0, 1, 0, 3, 12 });
        moveZeroes(new int[] { 0 });
    }
}
