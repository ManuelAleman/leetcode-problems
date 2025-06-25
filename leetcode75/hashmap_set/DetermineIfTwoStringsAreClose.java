//LeetCode Problem: https://leetcode.com/problems/determine-if-two-strings-are-close/
package leetcode75.hashmap_set;

import java.util.Arrays;

public class DetermineIfTwoStringsAreClose {
    public static boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(char c : word1.toCharArray()){
            arr1[c-'a']++;
        }

        for(char c : word2.toCharArray()){
            arr2[c-'a']++;
        }

        for(int i=0; i<26; i++){
            if((arr1[i] == 0 && arr2[i] !=0 ) ||  (arr2[i] == 0 && arr1[i] !=0 )) return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "bca"));
        System.out.println(closeStrings("a", "aa"));
        System.out.println(closeStrings("cabbba", "abbccc"));
        System.out.println(closeStrings("abbbzcf", "babzzcz"));
        System.out.println(closeStrings("abbzzca", "babzzcz"));
    }
}
