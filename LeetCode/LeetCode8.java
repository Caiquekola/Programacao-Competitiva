import java.math.BigInteger;

public class LeetCode8 {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi(args[0]));
    }

    public boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

    class Solution {
        public static int myAtoi(String s) {
            s = s.trim();
            if (s.length() == 0) {
                return 0;
            }
            double reposta = 0;
            char[] letras = s.toCharArray();
            boolean negativo = false;
            int i = 0;
            if (letras[0] == '-' || letras[0] == '+') {
                if (letras[i] == '-')
                    negativo = true;
                i++;
            }
            for (; i < letras.length; i++) {

                if (Character.isDigit(letras[i])) {
                    int numero = Character.getNumericValue(letras[i]);
                    reposta = (reposta * 10) + numero;
                    System.out.println(reposta);
                    continue;
                }
                break;
            }
            if (negativo) {
                reposta *= -1;
            }
            if (reposta > Integer.MAX_VALUE) {
                reposta = Integer.MAX_VALUE;
            } else if (reposta < Integer.MIN_VALUE) {
                reposta = Integer.MIN_VALUE;
            }
            return (int) reposta;
        }

    }

}
