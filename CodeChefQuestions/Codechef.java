package CodeChefQuestions;
import java.util.*;
import java.lang.*;
import java.io.*;

//Search an element in an array
// You have given an array A of size N and an element X. Your task is to find whether the arr A contains the element X or Not

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int X= sc.nextInt();
        int[] A= new int[N];
        for(int i=0; i<N; i++){
            A[i]= sc.nextInt();
        }
        for(int n: A){
            if(n==X){
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
        return;
    }
}
