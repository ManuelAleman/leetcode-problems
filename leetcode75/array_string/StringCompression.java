//LeetCode Problem: https://leetcode.com/problems/string-compression/
package leetcode75.array_string;

public class StringCompression {
    public static int compress(char[] chars) {
        if(chars.length==1) return 1;
        for( int i=0; i<chars.length; i++ ){
           
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a','a','b','b','c','c','c'}));                              //6
        System.out.println(compress(new char[]{'a'}));                                                      //1
        System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));      //4
    }
}
