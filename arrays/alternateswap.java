package arrays;

public class alternateswap {
    public static void printArr(int[] arr) {
        for ( int nums: arr) {
            System.out.print(nums + " ");    
        }
    }
    public static void alt(int[] arr) {
        int temp;  
        for (int i = 0; i < arr.length; i=i+2) {
            if (i + 1 < arr.length) {
                temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

            }
        }
         printArr(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("array after alternate swap is ");
        alt(arr);
    }
}
