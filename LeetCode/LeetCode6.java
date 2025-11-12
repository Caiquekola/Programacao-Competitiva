import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(Solution.convert("PAYPALISHIRING", 3));
    }
}

class Solution {
    public static String convert(String s, int numRows) {
        List<StringBuilder> linhas = new ArrayList<>();
        char[] letras = s.toCharArray();
        for (int i = 0; i < numRows; i++) {
            linhas.add(new StringBuilder());
        }
        
        boolean 

        for (int i = 0; i < numRows; i++) {
            
            System.out.println(linhas.get(i).toString());
        }
        return "";
    }
}