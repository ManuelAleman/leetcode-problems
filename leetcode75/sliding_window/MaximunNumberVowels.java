//LeetCode Problem: https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
package leetcode75.sliding_window;

public class MaximunNumberVowels {
    public static int maxVowels(String s, int k) {
        int curr=0;

        for(int i=0; i<k; i++){
            if(isVowel(s.charAt(i))) curr++;
        }

        int max = curr;

        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i))) curr++;

            if(isVowel(s.charAt(i-k))) curr--;

            max = Math.max(max, curr);

            if(max == k) return max;
        }

        return max;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("weallloveyou", 7));
    }
}