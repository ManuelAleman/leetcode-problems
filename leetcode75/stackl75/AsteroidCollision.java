//LeetCode Problem: https://leetcode.com/problems/asteroid-collision/
package leetcode75.stackl75;

import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int n : asteroids) {
            boolean isTrue=false;
            while (!stack.isEmpty() && n < 0 && stack.peek() > 0) {
                if (Math.abs(n) > stack.peek()) {
                    stack.pop();
                    continue;
                }else if(stack.peek() == Math.abs(n)) {
                    stack.pop();
                }

                isTrue=true;
                break;
            }

            if(!isTrue)
                stack.push(n);

        }

        int n[] = new int[stack.size()];
        int i = 0;
        while (!stack.empty()) {
            n[i++] = stack.pop();
        }

        for (int j = 0; j < n.length / 2; j++) {
            int t = n[j];
            n[j] = n[n.length - 1 - j];
            n[n.length - 1 - j] = t;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(asteroidCollision(new int[] { 5, 10, -5 })));
        System.out.println(Arrays.toString(asteroidCollision(new int[] { 8, -8 })));
        System.out.println(Arrays.toString(asteroidCollision(new int[] { 10, 2, -5 })));
        System.out.println(Arrays.toString(asteroidCollision(new int[] { -2, -1, 1, 2 })));
    }

}
