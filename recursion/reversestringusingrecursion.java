package recursion;

public class reversestringusingrecursion {
    public static void printStrin(String str, int idx) {
        if (idx==0) {
            System.out.print(str.charAt(idx));
        } else {
            System.out.print(str.charAt(idx));
            printStrin(str, idx-1);
        }
    }
    public static void main(String[] args) {
        String str = "abcd";
        int idx = str.length() - 1;
        System.out.println("the rever sal of string is ");
        printStrin(str,idx);
    }
}
