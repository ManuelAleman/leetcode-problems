//LeetCode Problem: https://leetcode.com/problems/reverse-words-in-a-string/
package leetcode75.array_string;

public class ReverseWordsString {
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1; i>=0; i--){
            if(words[i].equals("")) continue;
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
}
