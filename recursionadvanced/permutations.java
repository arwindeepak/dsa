package recursionadvanced;

public class permutations {
    public static void permutation(String str, String permutation) {
        if (str.length()==0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            //"abc"=> "ab"
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutation(newStr, permutation + current);
        }
    }

    public static void main(String[] args) {
        String str = "ab";
        permutation(str, "");
    }
}
