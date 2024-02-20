package arrays;

public class duplicateelement {
    public static int duplicate(int arr[]) {
        int element = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                element = arr[i];
            }
        }
        return element;

    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 4, };
        System.out.println("the duplicate element in the array is "+ duplicate(arr));

    }
}
