package arrays;

/**
 * allduplicate
 */
public class allduplicate {
    public static void duplicate(int arr[]) {
     
        for (int i = 0; i < arr.length; i++) {
            for ( int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    // break;
                }
            }
        }
       

 }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4, 4 ,9,9};
        System.out.println("the duplicate elements in the array are");
        duplicate(arr);
    }
}