package desafio;

import java.util.Scanner;

public class LeetCode1544 {

    public static String makeGood(String s) {
        
        s += " ";
        String str = "";
        for (int i = 0; i <= s.length() - 2; i++) {
            boolean menor = ((int) s.charAt(i) == (int) s.charAt(i + 1) + 32);
            boolean maior = ((int) s.charAt(i) == (int) s.charAt(i + 1) - 32);
            if(!(menor|maior)){
                str += s.charAt(i);
            }else{
                i++;
            }
            

        }
        if(!(s.trim().equals(str))&!(str.isEmpty())){
            return makeGood(str);
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        System.out.println(makeGood(str));

    }
}
