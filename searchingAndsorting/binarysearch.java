package searchingAndsorting;

import java.util.Scanner;

public class binarysearch {
    public static int binary(int[] arr, int target) {
        int n=arr.length;
        int low = 0, high = n - 1, mid = (high + low) / 2;
        while (low<=high) {
            if (arr[mid]==target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = high - 1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target element whose location ");
        int target = input.nextInt();
        int ans = binary(arr, target);
        if (ans == -1) {
            System.out.println("element not found ");
        } else {
            System.out.println(" element found at location "+ ans);
        }
    }
}
