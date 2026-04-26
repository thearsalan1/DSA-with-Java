package Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}

class MyStack{
    Node head;
    int size;

    int peek(){
        return head.val;
    }

    int pop(){
        if(size==0){
            System.out.println("Stack is empty");
            return -1;
        }
        int num = head.val;
        head=head.next;
        size--;
        return num;
    }

    void push(int num){
        Node n = new Node(num);
        n.next=head;
        head=n;
        size++;
    }
}

public class ImplementingStackUsingLinkedList {

}
