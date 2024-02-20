package searchingAndsorting;

public class bubblesort {
    public static void print(int[] arr) {
        for(int nums:arr){
          System.out.print(nums + " ");
        }
    }
    public static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        print(arr);
    }
    public static void main(String[] args) {
        int arr[] = {  5,4,3 };
       
        System.out.println(" the array after sorting using bubble sort is ");
       bubblesort(arr);
    }
}
