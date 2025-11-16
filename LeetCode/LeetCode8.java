public class LeetCode8 {
    public static void main(String[] args) {
        System.out.println(Solution.myAtoi("wrs01313a"));
    }

    class Solution {
        public static int myAtoi(String s) {
            s = s.trim();
            int pos = 0;
            int result = 0;
            boolean negativo = false;
            try {
                char letras[] = s.toCharArray();
                if (letras[0] == (int) 45) {
                    pos++;
                    negativo = true;
                }
                for (; pos < letras.length; pos++) {
                    int letra = (int) letras[pos];
                    if (letra < 48 || letra > 57) {
                        return Integer.parseInt(s.substring(0, pos));
                    }
                }
                result = Integer.parseInt(s);
            } catch (Exception e) {
                return 0;
            }
            /*
             * s =
             * "-91283472332"
             * 
             * Output
             * 0
             * Expected
             * -2147483648
             */
            return result;
        }
    }
}
