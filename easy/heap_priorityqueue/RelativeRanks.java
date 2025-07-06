//LeetCode Problem: https://leetcode.com/problems/relative-ranks/
package easy.heap_priorityqueue;

import java.util.Arrays;
import java.util.PriorityQueue;

public class RelativeRanks {
    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b ) -> score[b] - score[a]);
        
        for(int i = 0; i<score.length; i++){
            pq.offer(i);
        }

        String[] ans = new String[score.length];
        
        int i=1;
        while(!pq.isEmpty()){
            int idx = pq.poll();
            if(i > 3){
                ans[idx] = String.valueOf(i);
            }else if(i == 1){
                ans[idx] = "Gold Medal";
            }else if(i == 2){
                ans[idx] = "Silver Medal";
            }else if(i == 3){
                ans[idx] = "Bronze Medal";
            }

            i++;
        }

        
        return ans;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5,4,3,2,1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10,3,8,9,4})));

    }
}
