package recursion;

import java.util.Scanner;

//my approach was this 

public class firstandlastoccurrenceusingrecursion {
    public static void first(String str, int idx, char value) {
        
        if (idx >= str.length()) {
            System.out.println("not found");
            return;
        }
        if (str.charAt(idx) == value) {
            System.out.println(idx);
            return;
        }
        first(str, idx+1, value);
    }
    

    public static void lastoccurrence(String str, int idx, char value) {
        if (idx == 0) {
            return;
        }
       
       
        if (str.charAt(idx) == value) {
       
            System.out.println(idx);
            return;
 

        }
                   
    lastoccurrence(str, idx - 1, value);
       
    }

    public static void main(String[] args) {
      
        char value = 'a';

        String str = "abaacdaefaah";
        int idx = str.length() - 1;
 System.out.println("the last occurrence of char in the string is at idx ");
 lastoccurrence(str, idx, value);
 System.out.println("the first occurrence of char in the string is at idx ");
  first(str, 0, value);
 
        
    }
}
