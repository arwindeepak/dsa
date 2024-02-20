package searchingAndsorting;

public class quicksort {
    public static void printArr(int arr[]) {
        for (int nums : arr) {
            System.out.println(nums + " ");
        }
    }

    public static int partition(int arr[], int l, int h) {
        int i = l;
        int pivot = arr[i];
        //j responsibility is to get the bigger element if not then increment value of i and then do the required swapping
          for (int j = i + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
} //swap between arr[i] and the pivot element
}
                int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
        return i;
    }

    public static void quicksort1(int arr[],int l,int h){
        if (l < h) {
            //1divide the array into subproblems
            int m = partition(arr, l, h);
            //conquer those subproblems
            quicksort1(arr, l, m-1);
            quicksort1(arr, m+1, h);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 50, 20, 70, 90, 10, 13, 17, 21 };
        int n = arr.length;
        System.out.println("array before sorting is ");
        printArr(arr);

        quicksort1(arr, 0, n - 1);
        System.out.println("array after sorting is ");
        printArr(arr);
    }
}
