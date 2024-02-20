package recursion;

public class lcm {
   
    
    public static void main(String[] args) {
        int a = 12;
        int b = 15;
        int lcm = findLCMUsingEulersTheorem(a, b);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }

    public static int findLCMUsingEulersTheorem(int a, int b) {
        int gcd = findGCD(a, b);
        return (a * b) / gcd;
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }

}
