 package recursion;

import java.util.Scanner;
 
 
 class chatgpt {
   
    
    // Recursive function to find the number of ways to climb the staircase
    public static int countWays(int n) {
        if (n < 0) {
            return 0; // Base case: If steps < 0, no way to climb
        } else if (n == 0) {
            return 1; // Base case: If steps = 0, one way to climb (no steps)
        } else {
            // Recursive case: Call the function recursively for 1 and 2 steps
            return countWays(n - 1) + countWays(n - 2);
        }
    }
    
    public static void main(String[] args) {
        int n = 5; // Number of steps in the staircase
        int ways = countWays(n);
        System.out.println("Number of ways to climb the staircase with " + n + " steps: " + ways);
    }


}
