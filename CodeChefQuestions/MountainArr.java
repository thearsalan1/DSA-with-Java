package CodeChefQuestions;

import java.util.*;
import java.lang.*;
import java.io.*;

// Find maximum in an Arr
//Given a list of N integers, representing height of mountains. Find the height of the tallest mountain

class MountainArr
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        for(int t=0 ; t<T ; t++){
            int N = sc.nextInt();
            int[] A = new int[N];
            for(int n=0 ; n<N ; n++){
                A[n]=sc.nextInt();
            }
            int max = 0;
            for(int i: A){
                if(max<i){
                    max=i;
                }
            }
            System.out.println(max);
        }

    }
}
