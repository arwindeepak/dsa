package recursion;

import java.util.Scanner;

public class fibonacci {
    public static int fibo(int n) {
        if (n<=1) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number until which you want to get the fibonacci series ");
        int n = input.nextInt();
        System.out.println(fibo(n));
        for (int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
