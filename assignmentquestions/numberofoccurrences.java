package assignmentquestions;

import java.util.Scanner;

public class numberofoccurrences {
    public static int occurrence(int arr[], int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = { 2, 5, 5, 5, 6, 6, 8, 9, 9 };
        Scanner input = new Scanner(System.in);
        System.out.println("enter the target element whose ocuurrence you want to find  ");
        int target = input.nextInt();
        int result = occurrence(arr, target);
        if (result != 0) {
             System.out.println("the target element occurs "+ occurrence(arr,target)+ " times");
         } else {
            System.out.println("element not found in the array ");
        }
       

    }
}
