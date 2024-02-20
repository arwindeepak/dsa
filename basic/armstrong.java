package basic;
import java.util.Scanner;

public class armstrong {
    public static int noOfDigits(int n){
        int digit=0;
        while(n>0){
            digit+=1;
            n/=10;
        }
    return digit;
     }
     public static boolean isArmstrong(int n){
        int originalNo=n;
       double sum=0;
       int digits=noOfDigits(n);
       while (n>0) {
        int num = n%10;
        sum=sum + Math.pow(num, digits);
        n/=10;
        
       }
        if (originalNo==sum) {
            return true;
        }else{
            return false;
        }

     }
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
       System.out.print("ENTER THE VALUE OF number for which you want to chech is armstrong or not: ");
      int n= input.nextInt();  
      boolean isArmstrong=isArmstrong(n);
      if (isArmstrong) {
        System.out.println("the number entered was armstrong number : ");
        
      }else{
        System.out.println("the number was not armstrong");
      }
    }
}
