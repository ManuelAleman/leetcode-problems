//LeetCode Problem: https://leetcode.com/problems/greatest-common-divisor-of-strings/
package leetcode75.array_string;


public class GCDS{
    public static String gcdOfStrings(String str1, String str2) {
        for(int i =0; i< str1.length(); i++){
            if(!(str1+str2).equals(str2+str1)){
                return "";
            }
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));      //"ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));     //"AB"
        System.out.println(gcdOfStrings("LEET", "CODE"));       //""
    }
}