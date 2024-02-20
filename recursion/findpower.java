package recursion;

import java.util.Scanner;

public class findpower {
    public static int power(int a, int b) {
        //brute force approach too solve this question time complexity is directly proportion to big oh of b
        //now reduce the value of b to reduce complexity
        //if b is even then we can divide it in two parts to reduce no of comparisons to the mid

        // if (b == 1) {
        //     return a;
        // } else {
        //     return a * power(a, b - 1);
        // }
        int mid = 0, result = 0, finalResult = 0;
        if (b == 1) {
            return a;
        } else {
            mid =  b / 2;
            result = power(a, mid);
            finalResult = result * result;
            if (b % 2 == 0) {
                return finalResult;
            } else {
                return  a*finalResult;
            }
        }
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = input.nextInt();
        System.out.println("eneter the value of b ");
        int b = input.nextInt();
        int result = power(a, b);
        System.out.println("the result of a^b is equal too "+result);
    }
}
