package recursion;

import java.util.Scanner;

public class GCDORHCF {
    public static int hcfgcd(int a, int b) {
        int result = 0;
        if (a==0) {
            return b;

        }
        else if (b == 0) {
            return a;
            
        }
        else if (a > b) {
            result= hcfgcd(b, a % b);
        }
        else if (a < b) {
            result = hcfgcd(a, b % a);
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the value of first number ");
        int a = input.nextInt();
        System.out.println("eneter the value of second number ");
        int b = input.nextInt();
        System.out.println("the hcf of two number or gcd is "+ hcfgcd(a,b));


    }
}
