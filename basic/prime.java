package basic;
import java.util.Scanner;
class prime{
    public static boolean isprime(int n){
        int i=2;
        while (i<n) {
            if (n%i==0) {
         
                return false;
            }
            i++;
        }
   
        return true;
    }
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF NUMBER OF WHICH YOU WANT TO CHECK NUMBER IS PRIME OR NOT : ");
       int n= input.nextInt();
       boolean isprime=isprime(n);
     if(isprime){
     System.out.println("THE NUMBER ENTERD IS PRIME");
     }else{
        System.out.println("NOT A PRIME NUMBER");
     }
    }
}