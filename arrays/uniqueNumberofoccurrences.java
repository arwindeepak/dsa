package arrays;

public class uniqueNumberofoccurrences {
    public static boolean occurenceUnique(int arr[]) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
             if (arr[i] == arr[i + 1]) {
                 count++;
        } 
        }
      
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4 };
        boolean occurenceUnique = occurenceUnique(arr);
        if (occurenceUnique) {
            System.out.println("each no have unique number of occurence");
        } else {
            System.out.println("nmot having unique number of occurrences ");
        }
    }
}
