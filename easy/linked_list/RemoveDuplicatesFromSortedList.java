//LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-list/
package easy.linked_list;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return null;
        ListNode curr = head;
        int val = curr.val;
        while(curr.next != null){
            if(val == curr.next.val){
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
            val = curr.val;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n = new ListNode(1);
        n.next = new ListNode(1);
        n.next.next = new ListNode(2);

        System.out.println("Lista original:");
        printList(n);

        ListNode result = deleteDuplicates(n);

        System.out.println("Lista después de eliminar duplicados:");
        printList(result);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
