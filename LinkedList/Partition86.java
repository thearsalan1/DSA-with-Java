package LinkedList;

public class Partition86 {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode t = head;
        ListNode t1=dummy1;
        ListNode t2 =dummy2;
        while(t!=null){
            if(t.val>=x){
                t2.next=t;
                t2=t2.next;
            }else{
                t1.next=t;
                t1=t1.next;
            }
            t=t.next;
        }
        t1.next=dummy2.next;
        t2.next=null;
        return dummy1.next;
    }
}
