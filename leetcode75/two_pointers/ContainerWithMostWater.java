//LeetCode Problem: https://leetcode.com/problems/container-with-most-water/
package leetcode75.two_pointers;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        int area = 0;
        while (i < j) {
            int curremt = Math.min(height[i], height[j]) * (j-i);
            area = Math.max(area, curremt);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }

        return area;
        
    }
    public static void main(String[] args) {
        System.out.println(maxArea(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }));   //49
        System.out.println(maxArea(new int[] { 1, 1 }));                        //1
        System.out.println(maxArea(new int[] {1,2,1}));                         //2
    }
}
