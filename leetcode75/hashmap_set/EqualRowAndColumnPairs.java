//LeetCode Problem: https://leetcode.com/problems/equal-row-and-column-pairs/
package leetcode75.hashmap_set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EqualRowAndColumnPairs {

    public static int equalPairs(int[][] grid) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        for (int i = 0; i < grid.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < grid.length; j++) {
                list.add(grid[i][j]);
            }
            map.put(list, map.getOrDefault(list, 0) + 1);
        }

        int cont = 0;

        for (int j = 0; j < grid.length; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                list.add(grid[i][j]);
            }

            cont += map.getOrDefault(list, 0);
        }

        return cont;
    }

    public static void main(String[] args) {
        System.out.println(equalPairs(new int[][] { { 3, 2, 1 }, { 1, 7, 6 }, { 2, 7, 7 } }));
    }
}
