//LeetCode Problem: https://leetcode.com/problems/can-place-flowers/
package leetcode75.array_string;

public class CanPlaceFlower{

    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        if(n==0) return true;

        for(int i=0; i<flowerbed.length; i++){
            if(flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0) && (i==flowerbed.length-1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
                if(n==0) return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
    }
}