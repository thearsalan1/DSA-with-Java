package DoublyLinkedList;

class Node{
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val=val;
    }
}

class DDL{
    Node head;
    Node tail;
    int size;
    void insetAtHead(int val){
        Node n1 = new Node(val);
        if(head==null) head= tail = n1;
        else{
            n1.next= head;
            head.prev = n1;
            head=n1;
        }
        size ++;
    }
    void insetAtTail(int val){
        Node n1 = new Node(val);
        if(head==null) head= tail = n1;
        else{
            tail.next=n1;
            n1.prev=tail;
            tail=n1;
        }
        size++;
    }
    void insetAtIdx(int val , int idx){
        Node n1 = new Node(val);
        if(head == null) head = tail = n1;
        if (idx < 0 || idx > size) {
            System.out.println("Index not found");
            return;
        }
        if(idx==0){
            insetAtHead(val);
            return;
        }
        if(idx==size) {
            insetAtTail(val);
            return;
        }
        else{
            Node temp =head;
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            Node temp2 = temp.next;
            temp.next=n1;
            n1.prev=temp;
            n1.next=temp2;
            temp2.prev=n1;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        if(size==1) head = tail =null;
        head=head.next;
        head.prev=null;
        size--;
    }
    void deleteAtTail(){
        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        if(size==1) tail = head = null;
        tail = tail.prev;
        tail.next=null;
        size--;
    }
    void deleteAtIdx(int idx){
        if(head==null){
            System.out.println("List is already empty");
            return;
        }
        if (idx < 0 || idx >= size) {
            System.out.println("Index out of bounds");
            return;
        }
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx-1; i++) {
            temp=temp.next;
        }
        Node toDelete = temp.next;
        Node nextNode = toDelete.next;

        temp.next = nextNode;
        if (nextNode != null) {
            nextNode.prev = temp;
        }
        size--;
    }
    void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ,");
            temp=temp.next;
        }
        System.out.println();
    }
    void reverseList(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ,");
            temp=temp.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DDL list = new DDL();
        list.insetAtHead(1);
        list.insetAtTail(2);
        list.insetAtTail(3);
        list.insetAtHead(0);
        list.display();
        list.insetAtIdx(22,2);
        list.display();
        list.reverseList();
    }
}
