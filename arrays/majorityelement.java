package arrays;

public class majorityelement {
    public static int majority(int[] arr) {
        int majorityelement = 0;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                majorityelement = arr[i];
                count++;

            } else if (majorityelement != arr[i]) {
                count--;
            } else if (majorityelement == arr[i]) {
                count++;
            }
        }

        return majorityelement;

    }
    // majority element condition is that it must be present more than n/2 in the array
    public static void main(String[] args) {
        int arr[] = { 1, 3,3,3,3, 3, 3, 5, 6,9,9,9,3,9 };
        System.out.println("the maojority element in the array is " + majority(arr));
    }
}
