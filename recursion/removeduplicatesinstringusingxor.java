package recursion;

/**
 * removeduplicatesinstringusingxor
 */
public class removeduplicatesinstringusingxor {
    public static void remove(String str, int idx) {
        char current = str.charAt(idx);
        for (int i = 0; i < str.length()-1; i++) {
            str = str ^ current;
        }
    }
 public static void main(String[] args) {
     String str = "abbccd";
     int idx = 0;
     System.out.println("string after removing duplicates elements using xor is");
     remove(str, idx); 
    }
}