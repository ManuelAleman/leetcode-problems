//LeetCode Problem: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
package binary_search_plan.search_in_array;

public class CountNegativeNumbers {
    public static int countNegatives(int[][] grid) {
        int cont = 0;
        int rows = 0;
        int cols = grid[0].length-1;

        while(rows < grid.length && cols >= 0){
            if(grid[rows][cols] < 0){
                cont += grid.length-rows;
                cols--;
            }else if(grid[rows][cols] >= 0){
                rows++;
            }
        }

        return cont;
    }
    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][]
        {   {4, 3, 2, -1}, 
            {3, 2, 1, -1}, 
            {1, 1, -1, -2}, 
            {-1, -1, -2, -3}
        }));
        System.out.println(countNegatives(new int[][]{{3,2}, {1,0}}));
    }
}
