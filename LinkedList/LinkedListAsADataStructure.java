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
    int size=0;
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
        this.size++;
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
        this.size++;
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        this.size--;
    }

    boolean search(int val){
        if(head==null) return false;
        Node temp = head;
        while(temp!=null){
            if(temp.val==val){
                return true;
            }
        }
        return false;
    }

    void insertIndex(int idx,int val){
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        Node newVal = new Node(val);
        for (int i = 0; i <idx ; i++) {
            temp=temp.next;
        }
        newVal.next=temp.next;
        temp.next=newVal;
    }

    void delete(int idx){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(idx<0 || idx>size){
            System.out.println("Invalid index");
        }
         Node temp = head;
        for (int i =  1; i<=idx-1 ; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        size--;
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
        list.delete(1);
        list.display();
    }
}
