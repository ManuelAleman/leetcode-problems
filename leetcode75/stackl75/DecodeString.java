//LeetCode Problem: https://leetcode.com/problems/decode-string/
package leetcode75.stackl75;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> stack = new Stack<>();
        Stack<StringBuilder> stackStr = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                stack.push(n);
                n = 0;
                stackStr.push(sb);
                sb = new StringBuilder();
            } else if (c == ']') {
                int num = stack.pop();
                StringBuilder aux = sb;
                sb = stackStr.pop();
                for (int i = 0; i < num; i++) {
                    sb.append(aux);
                }
                
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));

    }
}
