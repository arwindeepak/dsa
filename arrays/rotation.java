package arrays;
public class rotation {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        //    print(arr);
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
        print(arr);

    }

    public static void print(int[] arr) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }

    public static void reverse(int []arr,int start,int end){
        while (start<end) {
           int  temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int k = 3;
        System.out.print("the array after rotation of k times is : ");
        rotate(arr, k);
    }
}
