package basic;
import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(int n){
        int reveredNum=0;
        int temp=n;
        while (n>0) {
            int digit=n%10;
             reveredNum=reveredNum*10+ digit;
             n/=10;            
        }
        if (temp==reveredNum) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
       System.out.print("eneter the number which you want to check is palindrome or not ");
      int n= input.nextInt();
      boolean isPalindrome=isPalindrome(n);
      if(isPalindrome){
        System.out.println("The number entered was palindrome");
      }else{
        System.out.println("number was not Palindrome");
      }
    }
}
