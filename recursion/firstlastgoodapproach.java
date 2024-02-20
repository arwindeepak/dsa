package recursion;

public class firstlastgoodapproach {
    public static int first = -1;
    public static int last = -1;

    public static void findoccurrence(String str, char element, int idx) {
        char current = str.charAt(idx);
        if(idx==str.length()-1){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if (current == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }

        }
        findoccurrence(str, element, idx + 1);
}

public static void main(String[] args) {
    String str = "abcdaaefgrad";
    findoccurrence(str, 'a', 0);
        
    }
}
