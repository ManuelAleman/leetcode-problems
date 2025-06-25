//LeetCode Problem: https://leetcode.com/problems/longest-palindromic-substring/
package medium.strings;

public class LongestPalindromixSubstring {
    public static String longestPalindrome(String s) {
        for (int right = s.length(); right > 0; right--) {
            for (int left = 0; left <= s.length() - right; left++) {
                if (palindromic(left, left + right, s))
                    return s.substring(left, left + right);
            }
        }
        return "";
    }

    private static boolean palindromic(int l, int r, String s) {
        int left = l;
        int right = r - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad")); // bab
        System.out.println(longestPalindrome("cbbd")); // bb
    }
}