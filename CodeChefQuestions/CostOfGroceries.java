package CodeChefQuestions;

import java.util.Scanner;

//Cost of Groceries Chef visited a grocery store for fresh supplies. There are N N items in the store where the i t h i th item has a freshness value A i A i  and cost B i B i  .
//Chef has decided to purchase all the items having a freshness value greater than equal to X
//- Find the total cost of the groceries Chef buys.
//Input Format The first line of input will contain a single integer T T, denoting the number of test cases. Each test case consists of multiple lines of input. The first line of each test case contains two space-separated integers N N and X X — the number of items and the minimum freshness value an item should have. The second line contains N N space-separated integers, the array A A, denoting the freshness value of each item. The third line contains N N space-separated integers, the array B B, denoting the cost of each item. Output Format For each test case, output on a new line, the total cost of the groceries Chef buys.

class CostOfGroceries {
    public int compute(int n, int x, int[] a, int[] b) {
        int cost = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= x) {
                cost += b[i];
            }
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            int[] a = new int[N]; // freshness values
            int[] b = new int[N]; // costs

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                b[i] = sc.nextInt();
            }

            CostOfGroceries cog = new CostOfGroceries();
            System.out.println(cog.compute(N, X, a, b));
        }

        sc.close();
    }
}