//Leetcode Problem: https://leetcode.com/problems/length-of-last-word/
package easy.strings;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[]words = s.split(" ");
        return words[words.length-1].length();
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
    }
}
