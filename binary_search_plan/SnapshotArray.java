//LeetCode Problem: https://leetcode.com/problems/snapshot-array/
package binary_search_plan;

import java.util.HashMap;

public class SnapshotArray {
    int array[];
    HashMap<Integer, int[]> map;
    int snapId = 0;

    public SnapshotArray(int length) {
        array = new int[length];
        map = new HashMap<>();
    }
    
    public void set(int index, int val) {
        array[index] = val;
    }
    
    public int snap() {
        map.put(snapId, array);
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
        return binarySearch(map.get(snap_id), index);
    }

    public int binarySearch(int[] array, int target){
        int low=0;
        int high = array.length-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(mid == target){
                return array[mid]-1;
            }

            if(mid<= target){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }

        return 0;
    }
    public static void main(String[] args) {
        
    }
}
