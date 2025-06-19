//LeetCode Problem: https://leetcode.com/problems/find-the-difference-of-two-arrays/
package leetcode75.hashmap_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheDifferenceOfTwoArrays {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());


        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }

        for(int n : set){
            if(!set2.contains(n)) list.get(0).add(n);
        }

        for(int n : set2){
            if(!set.contains(n)) list.get(1).add(n);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3}, new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,2,3}, new int[]{1,1,2,2}));
        System.out.println(findDifference(new int[]{1,2,3,3}, new int[]{1,1,2,2}));
    }
}
