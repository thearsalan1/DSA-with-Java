package LinkedList;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class Linkedlist{
    Node head;
    Node tail;
    Linkedlist(){
        head = tail = null;
    }
    void get(int idx){
        Node temp = this.head;
        for (int i = 0; i <= idx; i++) {
            temp=temp.next;
        }
        System.out.println(temp.val);
    }

    void addAtTail(int num){
        Node temp = new Node(num);
        if(tail == null) head = tail = temp;
        else{
            this.tail.next = temp;
            tail=temp;
        }
    }

    void display(){
        if(head==null) return;
        Node temp =head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void addAtHead(int num){
        Node temp = new Node(num);
        if(head == null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
}

public class LinkedListAsADataStructure {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addAtTail(3);
//        list.get(0);
        list.display();
        list.addAtHead(5);
        list.display();
        list.addAtTail(0);
        list.display();
    }
}
