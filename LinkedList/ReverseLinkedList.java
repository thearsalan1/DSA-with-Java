package LinkedList;

public class ReverseLinkedList {
    static ListNode reverse(ListNode head){
        ListNode p =null;
        ListNode f = head;
        ListNode c = head;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p;
    }
}
