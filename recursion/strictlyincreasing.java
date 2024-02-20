package recursion;

public class strictlyincreasing {
    public static boolean striclyincreasing(int arr[], int idx) {
             int n = arr.length-1;
        if (idx==n) {
            return true;
        }
   
        if (arr[idx] < arr[idx + 1]) {
          return   striclyincreasing(arr, idx + 1);
        }
        
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        int idx = 0;
        boolean increasing = striclyincreasing(arr,idx);
        if(increasing){
         System.out.println("arreay is strictly increasing");
     } else {
            System.out.println("not strictly increasing");
        }
    }
}
