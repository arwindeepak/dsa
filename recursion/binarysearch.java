package recursion;

import java.util.Scanner;

public class binarysearch {
    public static int binarysearch(int[] arr, int low, int high, int x) {
         int mid = (low + high) / 2;
        if (arr[mid]==x) {
            return mid;

        } else if (arr[mid] > x) {
          return  binarysearch(arr, low, mid - 1, x);
        } else {
         return    binarysearch(arr, mid + 1, high, x);
        }
           
        
    }
    public static void main(String[] args) {
        int[] arr = { 2, 4, 12, 16, 19, 21, 27, 29, 35 };
        Scanner input = new Scanner(System.in);
        System.out.println("enter the element you want to search in the array ");
        int x = input.nextInt();
        int low = 0;
        int high = arr.length - 1;
    
        int result = binarysearch(arr, low, high, x);
        System.out.println("element is present at index "+ result);
    }
}
