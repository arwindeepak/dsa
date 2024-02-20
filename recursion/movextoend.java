package recursion;

/**
 * movextoend
 */
public class movextoend {
    public static void move(String str, int idx, char element,String newStr,int count) {
       
       
        int n = str.length();
        if (idx == n) {
            for (int i = 0; i < count; i++) {
                newStr = newStr+element;
            }
            
            System.out.println(newStr);
            return;
        }
        char current=str.charAt(idx);
        if (current==element) {
            count = count + 1;
        } else {
            newStr = current + newStr;
        }
        move(str, idx+1, element,newStr,count);
        
    }

    public static void main(String[] args) {
        String str = "axbxcxd";
        int idx = 0;
        char element = 'c';
        String newStr = "";
          int count = 0;
        move(str, idx, element,newStr,count);
    }
}
