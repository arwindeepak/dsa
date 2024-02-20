package searchingAndsorting;

import java.util.Scanner;

public class lowerboundfirstoccurence {
    public static int firstoccurrence(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int result=-1;
        while (low <= high) {
          int  mid = (low + high) / 2;
          if (arr[mid] == target) {
              result = mid; //here is the only difference with binary search that we stored the value of mid in 
              //the result variable and then to get first occurrence from left side
              high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;

            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4,5, 6,7};
        Scanner input = new Scanner(System.in);
        System.out.println("enter the element whose first occurrence you want to find :");
        int target = input.nextInt();

        int result = firstoccurrence(arr, target);
        if (result!=-1) {
            System.out.println("element first occurrence is at "+ result + " index");
        } else {
            System.out.println("element not found ");
        }
    }
}
