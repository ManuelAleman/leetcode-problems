package easy.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckPrimeFrecuency{
    public static boolean prime(int n){
        if(n < 2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static boolean checkPrimeFrequency(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int v : map.values()){
            if(prime(v)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkPrimeFrequency(new int[]{1,2,3,4,5,4}));
        System.out.println(checkPrimeFrequency(new int[]{1,2,3,4,5}));
        System.out.println(checkPrimeFrequency(new int[]{2,2,2,4,4}));
        System.out.println(checkPrimeFrequency(new int[]{3,0,3,6,3,3}));
    }
}