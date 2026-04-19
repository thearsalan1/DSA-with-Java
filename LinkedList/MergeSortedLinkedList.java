package LinkedList;

class LinkNode{
    int val;
    LinkNode next;
    LinkNode(int num){
        this.val=num;
    }
}

class LinkedListNode {
    LinkNode head =null;
    int size;
    void add(int num){
        LinkNode temp = new LinkNode(num);
        if(head==null){
            head=temp;
            size++;
            return;
        }
        LinkNode find =head;
            while(find.next!=null) {
                find = find.next;
            }
        find.next=temp;
        size++;
    }

    LinkNode MergeTwoSortedList(LinkNode head1, LinkNode head2){
        LinkNode d = new LinkNode(-1);
        LinkNode i =head1;
        LinkNode j= head2;
        LinkNode k= d;
        while(i!=null && j!=null){
            if(i.val<j.val){
                k.next=i;
                i=i.next;
            }else{
                k.next=j;
                j=j.next;
            }
            k=k.next;
        }
        if(i== null){
            k.next=j;
        }else{
            k.next=i;
        }
        return d.next;
    }
}

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        LinkedListNode l1 = new LinkedListNode();
        LinkedListNode l2 = new LinkedListNode();
        l1.add(1);
        l1.add(3);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l2.add(2);
        l2.add(4);
        l2.add(6);
        l2.add(8);
        l2.add(10);
        System.out.println(l1.size);

        LinkedListNode list = new LinkedListNode();
        LinkNode mergedHead = list.MergeTwoSortedList(l1.head, l2.head);

        // Print merged list
        LinkNode curr = mergedHead;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
