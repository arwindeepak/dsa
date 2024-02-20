package recursion;

public class subsequence {
    public static void subsequences(String str, int idx, String newString) {
      if (idx==str.length()) {
          System.out.println(newString);
          return;
      }
        char current = str.charAt(idx);
        //if want oo add character
        subsequences(str, idx + 1, newString + current);
        //if do not want to add character
        subsequences(str, idx+1, newString);
        }
    public static void main(String[] args) {
        String str = "ab";
        String newString = "";
        int idx = 0;
        System.out.println("all possible subsequence are ");
        subsequences(str, idx, newString);
    }
}
