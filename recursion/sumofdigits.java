package recursion;

public class sumofdigits {
    public static int digit(int num) {
      if (num<=0) {
          return 0;
      } else {
          return num % 10 + digit(num / 10);
      }
        

    }
    public static void main(String[] args) {
        int num = 123;
        System.out.println("the sum of digits of the given number is "+ digit(num));
    }
}
