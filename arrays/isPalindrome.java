package arrays;

public class isPalindrome {
    public static boolean isPalindrome(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] == arr[(arr.length - 1) - i]) {
                return true;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,2,1};

        boolean isPalindrome=isPalindrome(arr);
        if(isPalindrome){
          System.out.println("the array you entered was palindrome");
      } else {
            System.out.println("array was not palindrome");
        }
    }
}
