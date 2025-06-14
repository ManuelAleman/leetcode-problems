//LeetCode Problem: https://leetcode.com/problems/time-based-key-value-store/
package binary_search_plan.search_in_array;

import java.util.ArrayList;
import java.util.HashMap;

class Pair{
    String val;
    int timestamp;

    Pair(String val, int timestamp){
        this.val = val;
        this.timestamp = timestamp;
    }
}

class TimeMap{
    HashMap<String, ArrayList<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<Pair>());
        }
        map.get(key).add(new Pair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        return binarySearch(map.get(key), timestamp);
    }

    public String binarySearch(ArrayList<Pair> pair,int target){
        int low = 0;
        int high = pair.size()-1;
        String answer = "";
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(pair.get(mid).timestamp <= target){
                answer = pair.get(mid).val;
                low = mid;
            }else{
                high = mid - 1;
            }
        }
        return answer;
    }
}


public class TimeBasedKeyValue{
    public static void main(String[] args) {
       
    }
}