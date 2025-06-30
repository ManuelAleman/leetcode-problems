//LeetCode Problem: https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
package leetcode75.linked_list;

public class DeleteMiddleNodeFromLinkedList {
    public static ListNode deleteMiddle(ListNode head) {
        if(head != null && head.next==null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode aux = head;
        while(aux.next!=null && aux.next != slow){
            aux = aux.next;
        }
        aux.next = slow.next;
        return head;
    }


    public static void main(String[] args) {
        
    }
}
