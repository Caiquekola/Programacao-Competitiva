public class LeetCode5 {
    public static void main(String[] args) {
        String str = "ccc";
        System.out.println(Solution.longestPalindrome(str));
    }
}
class Solution {
    public static String longestPalindrome(String s) {
        int inicio = 0;
        int fim = 1;
        int tamMaior = 1;
        int tamanhoAtual = 0;
        char[] letras = s.toCharArray();
        if(letras.length==1){
            return s;
        }
        int j = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            j = i - 1;
            k = i + 1;
            tamanhoAtual = 1;
            while (k < s.length() && j >= 0 && letras[j] == letras[k]) {
                tamanhoAtual++;
                j--;
                k++;
            }
            if (tamanhoAtual > tamMaior) {
                tamMaior = tamanhoAtual;
                inicio = j+1;
                fim = k;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            j = i;
            k = i + 1;
            tamanhoAtual = 1;
            while (k < s.length() && j >= 0 && letras[j] == letras[k]) {
                tamanhoAtual++;
                j--;
                k++;
            }
            if (tamanhoAtual > tamMaior) {
                tamMaior = tamanhoAtual;
                inicio = j + 1;
                fim = k;

            }
        }
        return s.substring(inicio, fim);
    }
}
