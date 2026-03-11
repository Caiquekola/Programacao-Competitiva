import java.util.ArrayList;
import java.util.List;

public class LeetCode6 {
    public static void main(String[] args) {
        System.out.println(Solution.convert("PAYPALISHIRING", 4));
        /*
         * P A H N
         * A P L S I I G
         * Y I R
         * And then read line by line: "PAHNAPLSIIGYIR"
         * 
         * Write the code that will take a string and make this conversion given a
         * number of rows:
         * 
         * string convert(string s, int numRows);
         */
    }
}

class Solution {
    public static String convert(String s, int numRows) {
        List<StringBuilder> linhas = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            linhas.add(new StringBuilder());
        }
        boolean subindo = false;
        int linhaAtual = 0;

        for (char c : s.toCharArray()) {
            linhas.get(linhaAtual).append(c);

            if (linhaAtual == 0 || linhaAtual == numRows - 1) {
                subindo = !subindo;
            }

            linhaAtual += subindo ? 1 : -1;
        }

        String result = "";
        for (int i = 0; i < numRows; i++) {

            result += linhas.get(i).toString();
        }
        return result;
    }
}