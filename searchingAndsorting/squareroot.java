package searchingAndsorting;

import java.util.Scanner;

public class squareroot {
    public static int square(int value) {
        int result = -1;
        int low = 0, high = value - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int sqr = mid * mid;
            if (sqr==value) {
                return mid;
            }
             else if (sqr>value) {
               high = mid - 1;
           } else if (sqr < value) {
            //to store the floor value of the number we did this for to get te less number as the answer of squareroot
               result = mid;
            low=mid+1;
           }
            
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for which you want to find the square root ");
        int value = input.nextInt();
        int result = square(value);
        System.out.println("the square root of the number is " + result);
    }
}
