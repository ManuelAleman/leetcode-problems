//LeetCode Problem: https://leetcode.com/problems/rotate-list/
package medium.linked_list;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if(head.next == null) return head;
        if(k == 0) return head;
        ListNode curr = head;
        int cont = 0;

        while(curr != null){
            cont++;
            curr = curr.next;
        }

        int mod = k % cont;
        if(mod == 0) return head;
        
        ListNode slow = head;
        ListNode fast = head;
        for(int i=0; i<mod ; i++){
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        curr = slow.next;
        slow.next = null;
        fast.next = head;
        
        return curr;
    }
    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);
        test.next.next.next.next = new ListNode(5);

        ListNode ans = rotateRight(test, 2);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
