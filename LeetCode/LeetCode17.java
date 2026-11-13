import java.util.ArrayList;
import java.util.List;

public class LeetCode17 {
    public static void main(String[] args) {

    }

    public static List<String> letterCombinations(String digits) {
        var digitos = digits.toCharArray();
        List<String> lista = new ArrayList<>();
        for (int i = 0; i < digitos.length; i++) {
            for (int k = 0; k < 3; k++) {
                StringBuilder digs = digitos[i];
                for (int j = i + 1; j < digitos.length - 1; j++) {

                }
            }

        }
        return new ArrayList<String>();
    }
}
