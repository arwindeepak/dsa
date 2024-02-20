package assignmentquestions;

public class countones {
    public static int ones(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[] = { 0, 0, 0, 0, 1, 1, 1, 1, 1 };
        System.out.println("the number of ones in the array are "+ ones(arr));
    }
}
