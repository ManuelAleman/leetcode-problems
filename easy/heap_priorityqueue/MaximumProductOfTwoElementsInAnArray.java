//LeetCode Problem: https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
package easy.heap_priorityqueue;

import java.util.PriorityQueue;

public class MaximumProductOfTwoElementsInAnArray {

    public static int maxProduct(int[] nums) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int num: nums){
            pq.offer(num);
        }

        return (pq.poll()-1) * (pq.poll()-1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{3,4,5,2}));
        
    }
}
