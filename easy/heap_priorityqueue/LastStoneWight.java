//LeetCode Problem: https://leetcode.com/problems/last-stone-weight/

package easy.heap_priorityqueue;

import java.util.PriorityQueue;

public class LastStoneWight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int stone : stones){
            pq.offer(stone);
        }

        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();

            if(y != x){
                int res = y - x;
                pq.offer(res);
            }

        }

        
        return pq.isEmpty() ? 0 : pq.poll();
    }



    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
        System.out.println(lastStoneWeight(new int[]{1}));
        System.out.println(lastStoneWeight(new int[]{2,2}));
    }
}
