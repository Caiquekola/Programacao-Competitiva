package desafio;

public class LeetCode20 {
    public static void main(String[] args) {
        String string = "([)]";
        System.out.println(isValid(string));
    }

    public static boolean isValid(String s) {
        int tam = s.length();
        int contador = 0;
        boolean tudoCerto = false;
        if(tam == 0) return false;
        if(tam % 2 != 0) return false;
        for(int i = 0; i < tam - 1; i++){
            contador = 1;
            if(s.charAt(i) == '('){
                for(int j = i + 1; j < tam; j++){
                    if(s.charAt(j) == '('){
                        return  false;
                    }
                    if(s.charAt(j) == ')'){
                        if(contador %2 ==  0){
                            tudoCerto = true;  
                        }

                    }
                    contador++;
                }
            }
            if(s.charAt(i) == '{'){
                for(int j = i + 1; j < tam; j++){
                    if(s.charAt(j) == '{'){
                        return false;
                    }
                    if(s.charAt(j) == '}'){
                        tudoCerto= true;
                    }
                }
            }
            if(s.charAt(i) == '['){
                for(int j = i + 1; j < tam; j++){
                    if(s.charAt(j) == '['){
                        return false;
                    }
                    if(s.charAt(j) == ']'){
                        tudoCerto= true;
                    }
                }
            }
        }
        return tudoCerto;
    }
}
