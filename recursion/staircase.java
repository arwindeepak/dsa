package recursion;

import java.util.Scanner;

public class staircase {
    public static int noways(int n) {
        if (n<=1) {
            return 1;
        } else {
            return noways(n-1) + noways(n-2);
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of stairs you want to climb ");
        int n = input.nextInt();
        int result = noways(n) ;
        System.out.println("the number of ways too reach at the top are "+ result);
    }
}
