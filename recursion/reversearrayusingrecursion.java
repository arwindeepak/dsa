package recursion;

public class reversearrayusingrecursion {
    public static void reverse(int[] arr, int idx) {
        if (idx == 0) {
            System.out.println(arr[idx]);
            return;
        } else {
            System.out.println(arr[idx]);
            reverse(arr, idx-1);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int idx = arr.length - 1;
        System.out.println("reversal of array using recursion is ");
        reverse(arr, idx);
    }
}
