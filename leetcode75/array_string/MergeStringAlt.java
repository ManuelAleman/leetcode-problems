//LeetCode Problem: https://leetcode.com/problems/merge-strings-alternately/
package leetcode75.array_string;

public class MergeStringAlt {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
    }
}
