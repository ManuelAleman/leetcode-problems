//LeetCode Problem: xhttps://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/
package medium.linked_list;

import java.util.Stack;

public class MaximumTwinSum{
    /*
    public static int pairSum(ListNode head) {
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int first = 0;
        int last = list.size()-1;
        int maxSum = 0;
        while (first < last) {
            int sum = list.get(first) + list.get(last);
            maxSum = Math.max(maxSum, sum);
            first++;
            last--;
        }

        return maxSum;
    }
    */

    public static int pairSum(ListNode head) {
        int maxSum = 0;
        Stack<ListNode> stack = new Stack<>();
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }


        while(slow != null){
            stack.add(slow);
            slow = slow.next;
        }

        ListNode curr = head;
        while(!stack.isEmpty()){
            maxSum = Math.max(maxSum, stack.pop().val + curr.val);
            curr = curr.next;
        }

        return maxSum;
    }


    public static void main(String[] args) {
        ListNode test = new ListNode(5);
        test.next= new ListNode(4);
        test.next.next = new ListNode(2);
        test.next.next.next = new ListNode(1);
        System.out.println(pairSum(test));
    }
}