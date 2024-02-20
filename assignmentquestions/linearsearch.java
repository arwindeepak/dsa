package assignmentquestions;

import java.util.Scanner;

public class linearsearch {
    public static int linearsearch1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the number of elements you want to add ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.print("enter the array elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("eneter the element to be searched in the array ");
        int target = input.nextInt();
        int result = linearsearch1(arr, target);
        if (result!=-1) {
            System.out.println("element found at index "+ result);
        } else {
            System.out.println("element not found in the array ");
        }
    }
}
