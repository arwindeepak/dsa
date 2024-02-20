package arrays;

public class reverseArray {
    public static void print(int[] arr) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
    public static void reverse(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("the reversal of an arr is");
        reverse(arr);
    }
}
