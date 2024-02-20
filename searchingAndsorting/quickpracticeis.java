package searchingAndsorting;

public class quickpracticeis {
    public static void print(int arr[]) {
        for (int nums : arr) {
            System.out.println(nums + " ");
        }
    }

    public static int partition(int arr[], int l, int h) {
        int i = l;
        int pivot = arr[l];
        for (int j = l + 1; j <= h; j++) {
            if (arr[j] <= pivot) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        int temp = arr[i];
        arr[i] = arr[l];
        arr[l] = temp;
        return i;
    }

    public static void quicksort(int arr[], int l, int h) {
        if (l < h) {
            int m = partition(arr, l, h);
            quicksort(arr, l, m - 1);
            quicksort(arr, m+1, h);
        }
    }
    public static void main(String[] args) {
        int arr[] = { 20, 12, 13, 56, 19, 14, 2 };
        int n = arr.length;
        System.out.println("the array after sorting is ");
        quicksort(arr, 0, n - 1);
        print(arr);

    }
}
