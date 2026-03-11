public class LeetCode8 {
    public static void main(String[] args) {
        // System.out.println(Solution.myAtoi(args[0]));
        for (int i = 1; i < 255; i++) {
            System.out.println("Char: "+(char)i+""+"Number:"+i);
        }
    }

    class Solution {
        public static int myAtoi(String s) {
            s = s.trim();
            char[] letras = s.toCharArray();
            int pos=0;
            if(letras[0]=='-'||letras[0]=='+'){
                pos++;
            }
            if(letras.length==0 || (letras[0]=='-'&&letras.length==1)){
                return 0;
            }
            for(int i = pos; i < letras.length;i++){
                if(((int)letras[i])>=48&&(int)letras[i]<=57){
                    
                }

            }
            

            


            return 1001;
        }
    }
}
