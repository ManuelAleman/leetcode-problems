//LeetCode Problem: https://leetcode.com/problems/kth-largest-element-in-an-array/
package leetcode75.heap_priorityqueue;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b - a);
        for(int num : nums){
            pq.offer(num);
        }

        for(int i=0; i<k-1; i++){
            pq.poll();
        }

        return pq.poll();
    }


    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        System.out.println(findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
