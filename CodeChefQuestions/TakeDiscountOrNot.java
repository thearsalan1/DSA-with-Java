package CodeChefQuestions;

import java.util.Scanner;

class TakeDiscountOrNot {

    public static String checkCoupon(int n, int x, int y, int[] prices) {
        int iniCost = 0;
        for (int price : prices) {
            iniCost += price;
        }

        int finCost = x;
        for (int price : prices) {
            if (price > y) {
                finCost += (price - y);
            } else {
                finCost += 0;
            }
        }

        if (iniCost > finCost) {
            return "COUPON";
        } else {
            return "NO COUPON";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int[] prices = new int[N];
            for (int j = 0; j < N; j++) {
                prices[j] = sc.nextInt();
            }

            System.out.println(checkCoupon(N, X, Y, prices));
        }

        sc.close();
    }
}