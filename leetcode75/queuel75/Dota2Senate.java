//LeetCode Problem: https://leetcode.com/problems/dota2-senate/
package leetcode75.queuel75;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static String predictPartyVictory(String senate) {
        Queue<Integer> queueR = new LinkedList<>();
        Queue<Integer> queueD = new LinkedList<>();

        for(int i=0; i<senate.length(); i++){
            if(senate.charAt(i) == 'R') 
                queueR.offer(i);
            else 
                queueD.offer(i);
        }

        while(!queueD.isEmpty() && !queueR.isEmpty()){
            int posR = queueR.poll();
            int posD = queueD.poll();
            if(posR < posD){
                queueR.offer(posR + senate.length());
            }else{
                queueD.offer(posD + senate.length());
            }
        }
        
        return queueR.isEmpty() ? "Dire" : "Radiant";
    }


    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD"));
        System.out.println(predictPartyVictory("RDD"));   
    }
}
