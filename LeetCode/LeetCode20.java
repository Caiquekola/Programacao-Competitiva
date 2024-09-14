package beeCrowd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class LeetCode20 {
    public static boolean isValid(String s) {
        Stack<Character> pilha = new Stack<>();
        char[] letras = s.toCharArray();
        for (int i = 0; i < letras.length; i++) {

            if(letras[i]=='('){
                pilha.push(')');
            }else if(letras[i]=='['){
                pilha.push(']');

            }else if(letras[i]=='{'){
                pilha.push('}');

            }

            else if(pilha.getLast()==letras[i]){
                pilha.pop();
            }else{

                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {
        String string = "([])";
        System.out.println(isValid(string));
    }
}
