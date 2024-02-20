package arrays;

public class pushingzeros {
      public static void print(int[] arr) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
    public static void pushingZeros(int[] arr) {
        int n = arr.length;
        int i = 0, j = i + 1;
        // print(arr);
        while (j < n) {
            if (arr[i] == 0 && arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;

            } else if (arr[i] == 0 && arr[j] == 0) {
                j++;
            }
            if (arr[i] != 0 && arr[j] != 0) {
                i++;
                j++;
            }
            // else {
            //     i++;
            //   }
        }
        print(arr);
    }
    public static void main(String[] args) {
          int arr[] = { 0, 2, 0, 4, 5, 6 };
      
        System.out.print("the array after pushing  all the zeros to the right side is : ");
        pushingZeros(arr);
    }
}
