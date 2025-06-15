//LeetCode Problem: https://leetcode.com/problems/string-compression/
package leetcode75.array_string;

public class StringCompression {
    public static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            chars[write++] = currentChar;

            if (count > 1) {
                String str = Integer.toString(count);
                for (char c : str.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));                              //6
        System.out.println(compress(new char[]{'a'}));                                                      //1
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));      //4
    }
}
