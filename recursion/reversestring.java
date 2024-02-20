package recursion;

public class reversestring {
    public static String reverse(String val, int length) {
        char[] arr = val.toCharArray();
        int left = 0, right = length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String val = "abcd";
        int length = val.length();
        System.out.println("the reverseal of the string is "+ reverse(val, length));
        
    }
}
