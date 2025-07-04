package easy.linked_list;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        if(head.val==val) return null;
        ListNode curr = head;

       if(curr.val == val){
        curr = curr.next;
       }else{
        while(curr.next != null){ 
            if(curr.next.val == val){
                curr = curr.next.next;
                continue;
            }
            curr = curr.next;
        }
       }

        return head;
    }

    public static void main(String[] args) {

    }
}
