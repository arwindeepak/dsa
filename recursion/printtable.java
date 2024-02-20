package recursion;

import java.util.Scanner;

public class printtable {
    public static void printmult(int n, int i) {
        //int i=1;
        if (i<=10) {
         
            System.out.println(n + "*" + i + "=" + n * i);
             printmult(n, i+1);
        } 
        
    }
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println(" enter the number whose multiplication table you want to print ");
       int n = input.nextInt();
       int i = 1;
       System.out.println("The multiplication table is ");
       printmult(n, i);
   } 
}
