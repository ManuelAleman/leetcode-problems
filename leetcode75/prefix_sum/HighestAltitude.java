//LeetCode Problem: https://leetcode.com/problems/find-the-highest-altitude/
package leetcode75.prefix_sum;

public class HighestAltitude{
    public static int largestAltitude(int[] gain) {
        int []prefix = new int[gain.length+1];
        int ans=0;
        for(int i=1; i< prefix.length; i++){
            int total = prefix[i-1] + gain[i-1];
            prefix[i] = total;
            ans = Math.max(ans, total);
        }

        return ans;
    }


    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));        //1
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));  //0
    }
}