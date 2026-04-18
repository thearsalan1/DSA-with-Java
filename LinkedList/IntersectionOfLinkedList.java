package LinkedList;

public class IntersectionOfLinkedList {

    public static void main(String[] args) {
        Node l1 = new Node(2);
        Node l2 = new Node(3);
        Node l3 = new Node(2);
        Node l4 = new Node(7);
        Node l5 = new Node(8);
        Node l6 = new Node(9);

        Node L1 = new Node(0);
        Node L2 = new Node(9);
        Node L3 = new Node(88);
        Node L4 = new Node(77);

        // Create intersection
        l1.next = l2; l2.next = l3; l3.next = l4; l4.next = l5; l5.next = l6;
        L1.next = L2; L2.next = L3; L3.next = L4; L4.next = l4; // <-- intersection at l4
        int ll1 = 0;
        int ll2=0;
        Node h1 = l1;
        Node h2= L1;
        while(h1!=null){
            h1=h1.next;
            ll1++;
        }
        while(h2!=null){
            h2=h2.next;
            ll2++;
        }
        if(ll1>ll2){
            for (int i = 0; i < ll1 - ll2; i++) {
                l1=l1.next;
            }
        }else{
            for (int i = 0; i < ll2 - ll1; i++) {
                l2=l2.next;
            }
        }

        while(l1 != l2){
            l1=l1.next;
            l2=l2.next;
        }
        System.out.println(l1);
    }
}
