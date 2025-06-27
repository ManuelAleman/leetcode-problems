//LeetCode Problem: https://leetcode.com/problems/removing-stars-from-a-string/
package leetcode75.stackl75;

import java.util.Stack;

public class RemovingStarsFromAString{
    public static String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c == '*'){
                stack.pop();
            }else{
                stack.push(c);
            }

        }
        StringBuilder ans = new StringBuilder();
        while (!stack.empty()) {
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }
}