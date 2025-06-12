//LeetCode Problem: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
package leetcode75.array_string;

import java.util.ArrayList;
import java.util.List;

public class KidsGreatestNumberOfCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;

        for(int c: candies){
            if(c>max) max = c;
        }


        for(int c : candies){
            list.add(extraCandies+c >= max);
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2,3,5,1,3}, 3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }
}
