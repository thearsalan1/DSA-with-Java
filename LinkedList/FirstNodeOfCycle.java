package LinkedList;

class ListNode {
      int val;
 ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }


public class FirstNodeOfCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast){
                ListNode find=head;
                while(slow!=find){
                    slow=slow.next;
                    find=find.next;
                }
                return find;
            }
        }
        return null;
    }
}
