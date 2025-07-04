//LeetCode Problem: https://leetcode.com/problems/intersection-of-two-linked-lists/
package easy.linked_list;

public class IntersectionOfTwoLinkedList{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while(a != b){

            a = (a!=null) ? a.next : headB;
            b = (b!=null) ? b.next : headA;
        }

        return a;
    }
    public static void main(String[] args) {
        
    }
}