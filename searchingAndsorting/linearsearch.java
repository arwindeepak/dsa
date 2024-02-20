package searchingAndsorting;

import java.util.Scanner;

public class linearsearch {
    public static int linearsearch(int []arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

        // System.out.println("enter the number of elements in the array  ");
        // int n=input.nextInt();
        // int arr[]=new int[n];
        // System.out.println("enter the array elements ");

        // for (int i = 0; i < n; i++) {
        //     arr[i] = input.nextInt();
        // }

        // System.out.println("enter the element you want to find in the array ");
        // int target = input.nextInt();
        // int index = linearsearch(arr, target);
        // if (index!=-1) {
        //     System.out.println("element found at index  " + index);
        // } else {
        //     System.out.println("element not found in the array");
        // }
        int arr[] = { 1, 2, 4, 6, 8, 9, 0 };
        System.out.println("enter the target element you want to find in the array ");
        int n = input.nextInt();
        if (linearsearch(arr,n)==-1) {
            System.out.println("element not found");
        } else {
             System.out.println("element found at location "+ linearsearch(arr, n));
        }
       

    }
}
