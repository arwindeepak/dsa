package recursion;

public class gpt {
    
    public static void moveEnd(String str, char ch, int idx, String newStr) {
        if (idx == str.length()) {
            // Print the new string after the recursive calls have completed
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(idx);
        if (current != ch) {
            // Append the character to newStr if it's not 'x'
            newStr += current;
        }
        // Move to the next character in the original string
        moveEnd(str, ch, idx + 1, newStr);
    }

    public static void main(String[] args) {
        String str = "xaxbxc";
        char ch = 'x';
        String newStr = ""; // Initialize newStr
        int idx = 0; 
        System.out.println("The string after removing 'x' is:");
        moveEnd(str, ch, idx, newStr); // Start the recursive call with an empty newStr
    }


    
    
}
