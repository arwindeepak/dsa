package arrays;

public class sortinorderwithoutalgo {
       public static void print(int[] arr) {
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
    }
    public static void sort(int[] arr) {

        int n = arr.length;
        int i = 0, j = n- 1,curr=0;
        while (curr <= j) {
            if (arr[curr] == 0) {
                // do swapping 
                int temp = arr[curr];
                arr[curr] = arr[i];
                arr[i] = temp;
                i++;
                curr++;
            } else if (arr[curr] == 2) {
                // do swapping for the right side
                int temp = arr[curr];
                arr[curr] = arr[j];
                arr[j] = temp;
                j--;
                // curr++;

            } else {
                curr++;
            }
        }
        print(arr);
           

        }
    
    public static void main(String[] args) {
        // input nums =[2,0,2,1,1,0]
        // output =[0,0,1,1,2,2]
          int arr[] = { 1, 0, 2, 0, 1, 2};
       
        System.out.print("the array after sorting in right order is : ");
        sort(arr);

    }
}
