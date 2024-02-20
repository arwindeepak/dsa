package searchingAndsorting;
//when array is almost sorted or fully sorted then it is one of the best algo to use 

//its a stable sort also relative order is maintained
//0(n2) in worst case scenario
//o(n) in best case scnario
public class insertionSort {
    public static void print(int arr[]){
        for ( int nums : arr) {
            System.out.print(nums + " ");
        }
    }
    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                //decrement to compare with the previous elements in the array 
                j--;
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = { 20, 40, 11, 19, 27, 45,40 };
        System.out.println("the array after insertion sorting is ");
        insertSort(arr);
    }
}
