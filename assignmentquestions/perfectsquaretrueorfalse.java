package assignmentquestions;

import java.util.Scanner;

public class perfectsquaretrueorfalse {
    public static boolean issquareroot(int element) {
        int low = 0, high = element - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sqr=mid*mid;
            if (sqr==element) {
                return true;
                

            } else if (sqr > element) {
                high = mid - 1;
                
            } else {
                low = low + 1;
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the element whose square root you want to check ");
        int element = input.nextInt();
        boolean issquareroot = issquareroot(element);
        if (issquareroot==true) {
            System.out.println("the number you entered was an perfect square");
        } else {
            System.out.println("not a perfect square ");
        }
    }
}
