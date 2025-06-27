//LeetCode Problem: https://leetcode.com/problems/longest-substring-without-repeating-characters/
package medium.strings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeting{
    public static int lengthOfLongestSubstring(String s) {
        
        int left=0;
        int ans=0;
        Set<Character> set = new HashSet<>();
        for(int right = 0; right < s.length() ; right++){
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                ans = Math.max(ans, right-left+1);
            }else{
                while (s.charAt(left) != s.charAt(right)) {
                    set.remove(s.charAt(left));
                    left++;
                }
                left++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}