package recursionadvanced;

import java.util.ArrayList;

public class subsets {
    public static void printsubset(ArrayList<Integer> subsetlist) {
        for (int i = 0; i < subsetlist.size(); i++) {
            System.out.print(subsetlist.get(i) + " ");
            
        }
    }
    public static void subset(int n, ArrayList<Integer> subsetlist) {
        if (n==0) {
            printsubset(subsetlist);
            return;
        }
        //add hoga
        subsetlist.add(3);
        subset(n - 1, subsetlist);
        //add nhi hoga
        subsetlist.remove(subsetlist.size() - 1);
        subset(n - 1, subsetlist);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subsetlist = new ArrayList<>();
        subset(n, subsetlist);
        
    }
}
