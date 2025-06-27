//LeetCode Problem: https://leetcode.com/problems/snapshot-array/
package binary_search_plan.search_in_array;

import java.util.TreeMap;

public class SnapshotArray {
    TreeMap<Integer, Integer>[] tree;
    int snap_id = 0;

    @SuppressWarnings("unchecked")
    public SnapshotArray(int length) {

        tree = new TreeMap[length];
        for(int i=0; i<length; i++){
            tree[i] = new TreeMap<Integer, Integer>();
            tree[i].put(0, 0);
        }
    }
    
    public void set(int index, int val) {
        tree[index].put(snap_id, val);
    }
    
    public int snap() {
        return snap_id++;
    }
    
    public int get(int index, int snap_id) {
        return tree[index].floorEntry(snap_id).getValue();
    }


    public static void main(String[] args) {
        
    }


}
