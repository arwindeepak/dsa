package recursion;
//time stamp 1 hr apna colleage video not understtood due to burn out
public class removeduplicatestring {
    public static boolean map[] = new boolean[26];
    public static void removeduplicates(String str, int idx, String newString) {
        char current = str.charAt(idx);
        if (idx==str.length()-1) {
            System.out.println(newString);
            return;
        }

        if (map[current-'a']==true) {
            removeduplicates(str, idx+1, newString);
        } else {
            newString += current;
            map[current - 'a'] = true;
            removeduplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        int idx = 0;
        String newString = "";
    
        System.out.println("string after removing the duplcates are ");
        removeduplicates(str, idx, newString);
    }
}
