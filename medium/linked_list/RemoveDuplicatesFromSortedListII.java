//LeetCode Problem: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
package medium.linked_list;

public class RemoveDuplicatesFromSortedListII {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummie = new ListNode(0);
        ListNode dummie2 = dummie;
        ListNode curr = head;
        while(curr != null){
            if(curr.next == null) {
                dummie.next = curr;
                curr = curr.next;
                dummie = dummie.next;
                break;
            }

            if(curr.val == curr.next.val){
                int auxVal = curr.val;
                while(curr!= null && auxVal == curr.val){
                    curr = curr.next;
                }
            }else{
                dummie.next = curr;
                curr = curr.next;
                dummie = dummie.next;
            }

        }
        dummie.next = null;

        return dummie2.next;
    }


    public static void main(String[] args) {
        ListNode test = new ListNode(1);
        test.next = new ListNode(2);
        test.next.next = new ListNode(2);

        ListNode ans = deleteDuplicates(test);

        while(ans!= null){
            System.out.println(ans.val);
            ans = ans.next;
        }
    }
}
