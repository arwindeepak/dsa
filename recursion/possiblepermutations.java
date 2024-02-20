package recursion;
import java.util.ArrayList;

public class possiblepermutations {

    public static ArrayList<String> generatePermutations(String str) {
        ArrayList<String> permutations = new ArrayList<>();
        generatePermutationsHelper("", str, permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(String prefix, String remaining, ArrayList<String> permutations) {
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutationsHelper(prefix + remaining.charAt(i),
                        remaining.substring(0, i) + remaining.substring(i + 1, n),
                        permutations);
            }
        }
    }

}

