//LeetCode Problem: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
package easy.strings;

public class FirstOcurrence {
    public static int strStr(String haystack, String needle) {
        
        for(int i=0; i<haystack.length(); i++){
            if(needle.length()+i > haystack.length()) break;
            if(haystack.substring(i, needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("hello", "ll"));
    }
}
