//LeetCode Problem: https://leetcode.com/problems/kth-largest-element-in-a-stream/
package easy.heap_priorityqueue;

import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> minHeap;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size() > k) minHeap.poll();
        return minHeap.peek();
    }
}
public class KthLargestElementInAStream {
    

    public static void main(String[] args) {
        
    }
}
