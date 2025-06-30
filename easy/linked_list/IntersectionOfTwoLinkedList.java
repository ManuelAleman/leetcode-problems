package easy.linked_list;

public class IntersectionOfTwoLinkedList{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        while(headA.next != null){
            headA = headA.next;
        }


        while(headB != headA ){
            headA = (headA!=null) ? headA.next : headB;
            headB = (headB!=null) ? headB.next : headA;
        }
        return headA;
    }
    public static void main(String[] args) {
        
    }
}