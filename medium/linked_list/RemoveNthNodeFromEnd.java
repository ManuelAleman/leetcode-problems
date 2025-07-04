//LeetCode Problem: https://leetcode.com/problems/remove-nth-node-from-end-of-list/
package medium.linked_list;

public class RemoveNthNodeFromEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummie = new ListNode(0);
        dummie.next=head;
        ListNode slow = dummie;
        ListNode fast = dummie;

        for(int i=0; i<=n; i++){
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return dummie.next;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next= new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);

        ListNode ans = removeNthFromEnd(test, 2);
        while (ans!=null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
