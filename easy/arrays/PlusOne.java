//LeetCode Problem: https://leetcode.com/problems/plus-one/
package easy.arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[] { 1, 2, 3 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 4, 3, 2, 1 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 9 })));
        System.out.println(Arrays.toString(plusOne(new int[] { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 })));
    }
}