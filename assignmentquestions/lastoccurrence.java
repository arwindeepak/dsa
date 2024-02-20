package assignmentquestions;

import java.util.Scanner;

public class lastoccurrence {
    public static int lastoccurrence(int[] arr, int target) {
        int n = arr.length;
        int low = 0, high = n - 1;
        int result = -1;
        while (low<=high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6 };
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target element ");
        int target = input.nextInt();
        int result = lastoccurrence(arr, target);
        if (result!=-1) {
            System.out.println("element last occurrence index at the target "+ result);
        } else {
            System.out.println("element not found in the array");
        }

    }
}
