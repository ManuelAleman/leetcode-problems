//LeetCode Problem: https://leetcode.com/problems/reverse-vowels-of-a-string/
package leetcode75.array_string;

public class ReverseVowelsofString{
    public static String reverseVowels(String s) {
        int low=0;
        int high = s.length()-1;
        char[] str = s.toCharArray();

        while(low < high){
            if(!isVowel(s.charAt(low))){
                low++;
            }
            if(!isVowel(s.charAt(high))){
                high--;
            }

            if(isVowel(s.charAt(low)) && isVowel(s.charAt(high))){
                char aux = s.charAt(high);
                str[high] = s.charAt(low);
                str[low] = aux;
                low++;
                high--;
            }
            
        }
        String answer = new String(str);
        return answer;
    }

    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || 
        c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'
        ;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm"));
        System.out.println(reverseVowels("leetcode"));
    }
}