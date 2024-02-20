package basic;
import java.util.Scanner;

/**
 * fibonacci
 */
public class fibonacci {
    public static int fibo(int n){
        if (n==0||n==1) {
            return n;
        }else{
            return fibo(n-1) + fibo(n-2);       
         }
        
    }

    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
       System.out.print("ENTER THE VALUE OF NUMBER Till which you want fibonacci series: ");
      int n= input.nextInt();
      System.out.print("the fibonacci series upto : "+ n + " numbers is ");
      for(int i=0;i<n;i++){
          System.out.print(fibo(i) + " ");
      }
      
    }
}