package arrays;

public class uniqueElement {
    public static int unique(int[] arr) {
        int element = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            element = element ^ arr[i]; 
        }
        return element;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 5, 2 };
        System.out.println("the unique element in the arrasy is "+ unique(arr));

    }
}
