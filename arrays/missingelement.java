package arrays;

public class missingelement {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4 };
    
        int n = arr.length;
        //to find the sum of the missing element also in the array so n+1 was their
        int natural_sum = ((n+1) * (n + 2) / 2);
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }

        int missingElement = natural_sum - sum;
        System.out.println(missingElement);

    }
}
