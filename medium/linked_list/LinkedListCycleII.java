//LeetCode Problem: https://leetcode.com/problems/linked-list-cycle-ii/
package medium.linked_list;

public class LinkedListCycleII {
     public static ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode cycle = head;
                while(cycle != slow){
                    cycle = cycle.next;
                    slow = slow.next;
                }
                return cycle;
            }
            
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode test = new ListNode(3);
        test.next = new ListNode(2);
        test.next.next = new ListNode(0);
        test.next.next.next = new ListNode(-4);
        

        ListNode ans = detectCycle(test);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
