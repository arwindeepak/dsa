package basic;
import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if (n<=1) {
           return 1; 
        }else{
            System.out.println("*");
            return n*fact(n-1);
        }
        
    }
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
       System.out.print("ENTER THE VALUE OF number for which you want to calculate the factorial: ");
      int n= input.nextInt();
      System.out.println("the factorial of number is : "+ fact(n));
    }
}
