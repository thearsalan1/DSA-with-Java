package LinkedList;

import java.util.ArrayList;

public class MergeKLinkedList {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ArrayList<ListNode> list= new ArrayList<>();
        for(ListNode n:lists) list.add(n);
        while(list.size()>1){
            ListNode a = list.get(list.size()-1);
            list.remove(list.size()-1);
            ListNode b = list.get(list.size()-1);
            list.remove(list.size()-11);
            ListNode c= merge(a,b);
            list.add(c);
        }
        return list.get(0);
    }
    ListNode merge(ListNode head1 , ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode i = head1;
        ListNode j = head2;
        ListNode k = dummy;
        while(i!=null && j!=null){
            if(i.val <= j.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i==null){
            k.next=j;
        }else{
            k.next=i;
        }
        return dummy.next;
    }
}
