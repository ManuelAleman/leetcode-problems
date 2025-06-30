//LeetCode Problem: https://leetcode.com/problems/reverse-linked-list/
package leetcode75.linked_list;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode aux = curr.next;
            curr.next = prev;
            prev = curr;
            curr = aux;


        }
        return prev;
    }

    public static void main(String[] args) {
        
    }
}
