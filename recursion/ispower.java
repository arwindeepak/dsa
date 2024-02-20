package recursion;

import java.util.Scanner;

public class ispower {
    public static boolean ispowerfour(int num) {
        if (num == 1) {
            return true;
        } else if (num % 4 != 0 || num <= 0) {
            return false;
        }
        return ispowerfour(num / 4);
    //     if (num == 1) {
    //         return true;
    //     } else if (num % 5 != 0 || num <= 0) {
    //         return false;
    //     }
    //   return  ispowerfour(num / 5);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("eneter the value of number for which you want to check is it power of four or not");
        int num = input.nextInt();
        boolean result = ispowerfour(num);
        if (result) {
            System.out.println("yse it is power of four");
        } else {
            System.out.println("no it not power of four ");
        }
    }
}
