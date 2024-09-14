package beeCrowd;

import java.util.Arrays;

public class LeetCode14 {
    public String problemBF(String[] strs){
        //Brute Force


        return ";";
    }

    public static String problemEF(String[] strs){
        //Brute Force
        StringBuilder sb = new StringBuilder();

        //Ordenação (Sort)
        Arrays.sort(strs);

        //Só preciso testar a primeira palavra e a última
        char[] primeiraPalavra = strs[0].toCharArray();
        char[] ultimaPalavra = strs[strs.length-1].toCharArray();

        for (int i = 0; i < primeiraPalavra.length; i++) {
            if(primeiraPalavra[i] != ultimaPalavra[i]){
                break;
            }
            sb.append(primeiraPalavra[i]);
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        String palavras[] = {"Alexya","Alice","Algas"};
        System.out.println(problemEF(palavras));
    }
}
