package Stack;

import java.util.Stack;

public class InsertAtBottomRecursively {
    public static void pushRec(Stack<Integer>st, int num){
        if(st.size()==0){
            st.push(num);
            return;
        }
        int n = st.pop();
        pushRec(st,num);
        st.push(n);
    }
    public static void main(String[] args) {
        Stack<Integer> st1 = new Stack<>();
        st1.push(1);
        st1.push(2);
        st1.push(3);
        st1.push(4);
        st1.push(5);
        pushRec(st1,6);
        while(st1.size()!=0){
            System.out.println(st1.pop());
        }
    }
}