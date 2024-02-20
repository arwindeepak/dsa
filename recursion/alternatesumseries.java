package recursion;

import java.util.Scanner;

public class alternatesumseries {
    public static int alternate(int n) {
        if (n == 0) {
            return n;
        } else if (n % 2 == 0) {
            return alternate(n - 1) - n;
        } else {
            return alternate(n - 1) + n;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number till which you want alternate sum series ");
        int n = input.nextInt();
        System.out.println("the alternate sum series till " + n + " is "+ alternate(n));
        
    }
}
