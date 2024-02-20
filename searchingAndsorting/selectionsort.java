package searchingAndsorting;

public class selectionsort {
    public static void print( int arr[]){
        for (int nums : arr) {
                System.out.print(nums + " ");
            }
    }
    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int min_element = i;
            //this loop finds the minimum element in the array
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_element]) {
                    min_element = j;
                }
            }
            //this if condition swaps the minimum element with the first element 
            if (min_element!=i) {
                int temp = arr[min_element];
                arr[min_element] = arr[i];
                arr[i] = temp;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 20, 50, 10, 15, 17, 25, 65 };
        System.out.println("the array after selection sort is ");
        selectionsort(arr);
        }
}
