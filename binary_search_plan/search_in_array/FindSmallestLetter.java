//LeetCode Problem: https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package binary_search_plan.search_in_array;

public class FindSmallestLetter {
    public static char nextGreatestLetter(char[] letters, char target) {

        int low = 0, high = letters.length-1;
        while(low<=high){
            int mid = low + (high-low) / 2;
            
            if(letters[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return letters[low % letters.length];
    }


    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));
        System.out.println(nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
        System.out.println(nextGreatestLetter(new char[]{'x','x','y','y'}, 'z'));
    }
}
