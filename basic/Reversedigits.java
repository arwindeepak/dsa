package basic;
import java.util.Scanner;

public class Reversedigits {
    public static int reverse(int n){
       int newNum=0;
        while (n>0) {
          int digit=n%10;
         newNum=newNum*10+ digit;
           n/=10;
        }
    
  return newNum;
    }
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF INTEGER OF WHICH YOU WANT TO REVERSE ITS NUMBERS : ");
       int n= input.nextInt();
       System.out.println("The reverse digits of the number are : "+ reverse(n));
    }
}
