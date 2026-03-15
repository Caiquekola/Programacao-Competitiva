import java.math.BigInteger;

public class LeetCode8 {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi(args[0]));
    }

    class Solution {
        public static int myAtoi(String s) {
            s = s.trim();
            char[] letras = s.toCharArray();
            int pos = 0;
            if (letras.length == 0) {
                return 0;
            }
            if (letras[0] == '-' || letras[0] == '+') {
                pos++;
                if(letras.length==1){
                    return 0;
                }
            }
            for (int i = pos; i < letras.length; i++) {
                if (((int) letras[i]) >= 48 && (int) letras[i] <= 57) {
                    pos++;
                }else{
                    break;
                }
            }
            if ((letras[0] == '-' || letras[0] == '+')&&pos==1) {
                {
                    return 0;
                }
            }
            if(pos == 0){
                return 0;
            }
            BigInteger value = new BigInteger(s.substring(0,pos));
            int comp = value.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)));
            if(comp==1){
                return Integer.MAX_VALUE;
            }else if(comp==-1){
                return Integer.MIN_VALUE;
            }else {
                return Integer.valueOf(s.substring(0, pos));
            }
        }
    }

}
