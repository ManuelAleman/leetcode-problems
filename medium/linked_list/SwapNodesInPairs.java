//LeetCode Problem: https://leetcode.com/problems/swap-nodes-in-pairs/
package medium.linked_list;

public class SwapNodesInPairs {
    public static ListNode swapPairs(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return head;
       
        ListNode left = head;
        ListNode right = head.next;
        while(true){
            int aux = left.val;
            left.val = right.val;
            right.val = aux;

            if(right.next == null || right.next.next == null){
                break;
            }
            left = left.next.next;
            right = right.next.next;
        }

        return head;
    }




    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(3);
        test.next.next.next = new ListNode(4);

        ListNode ans = swapPairs(test);
        while(ans != null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
