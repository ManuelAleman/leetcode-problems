//LeetCode Problem: https://leetcode.com/problems/find-right-interval/
package binary_search_plan.search_in_array;

import java.util.Arrays;

public class FirstRightInterval{
    public static int[] findRightInterval(int[][] intervals) {
        int[][] map = new int[intervals.length][2];
        for(int i=0;i<intervals.length;i++){
            map[i][0] = intervals[i][0];
            map[i][1] = i;
        }
        
        Arrays.sort(map, (a, b) -> Integer.compare(a[0], b[0]));

        int[] output = new int[intervals.length];
        for(int i=0;i<intervals.length;i++){
            output[i] = binarySearch(map, intervals[i][1]);
        }

        return output;
    }

    public static int binarySearch(int[][] map, int target){
        int low=0;
        int high=map.length-1;
        int res =-1;
        while(low<=high){
            int mid = low + (high-low) / 2;
            if(map[mid][0] >= target){
                res = map[mid][1];
                high = mid -1;
            }else{
                low = mid + 1;
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1,2}})));                 //[-1]
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{3,4},{2,3},{1,2}})));     //[-1, 0, 1]
        System.out.println(Arrays.toString(findRightInterval(new int[][]{{1,4},{2,3},{3,4}})));     //[-1, 2, -1]
    }
}