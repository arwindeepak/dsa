package basic;
import java.util.Scanner;

public class LCM{
    public static int LCM(int first,int second){
        int i=1;
        while (i<=first) {
            int factor=first*i;
            if (factor%second==0) {
                return factor;
            }
                    i++;
        }
     return 0;
    }
    public static void main(String[]args){
       Scanner input=new Scanner(System.in);
       System.out.print("ENTER THE VALUE OF FIRST NUMBER : ");
      int first= input.nextInt();
     
      System.out.print("ENTER THE VALUE OF SECOND NUMBER : ");
     int second= input.nextInt();
     System.out.println("THE LCM OF TWO NUMBERS ENTERED WERE: "+LCM(first,second));
    }
}