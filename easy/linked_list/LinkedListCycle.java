//LeetCode Problem: https://leetcode.com/problems/linked-list-cycle/
package easy.linked_list;

public class LinkedListCycle {
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
    }
}
