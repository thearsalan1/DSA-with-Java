package OOPS;

//User defined DataStructure
class Arraylist{
    int[] arr;
    int idx = 0;
    int size = 0;
    Arraylist(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(arr.length == idx){
            int[] arr2= new int[arr.length*2];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }
            arr=arr2;
        }
        arr[idx++]=ele;
        size++;
    }
    int capacity(){
        return arr.length;
    }
    void display(){
        for (int i = 0; i < this.size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int get(int idx){
        if(idx >= arr.length){
             throw new Error("Index Out of bound");
        }
        return arr[idx];
    }
}

public class OwnArrayList {
    public static void main(String[] args) {
        Arraylist arr = new Arraylist(10);
        System.out.println(arr.capacity());
        arr.add(12);arr.add(1);arr.add(2);arr.add(132);
        System.out.println(arr.size);
        arr.display();
        System.out.println(arr.get(4));
    }
}
