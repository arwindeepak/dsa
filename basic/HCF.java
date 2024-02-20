package basic;
import java.util.Scanner;

public class HCF {
    public static int least(int first,int second){
        if (first<second) {
            return first;
        }else{
            return second;
        }
        
    }
    public static int GCD(int first,int second){
 int gcd=1;
 int i=2;
 int leastNum=least( first, second);
 while (i<=leastNum) {
    if (first%i==0 && second%i==0) {
       gcd =i; 
    }
    i++;
 }
        return gcd;
    }
    public static void main(String[] args) {
               Scanner input=new Scanner(System.in);
       System.out.print("ENTER THE VALUE OF FIRST NUMBER : ");
      int first= input.nextInt();
     
      System.out.print("ENTER THE VALUE OF SECOND NUMBER : ");
     int second= input.nextInt();
     System.out.println("THE GCD OF TWO NUMBERS ENTERED WERE: "+GCD(first,second));
    }
}
