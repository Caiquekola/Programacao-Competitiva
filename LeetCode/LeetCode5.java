public class LeetCode5 {
    public static void main(String[] args) {
        String str = "ABBAA";
        System.out.println(longestPalindrome(str));
    }

    public static String longestPalindrome(String s) {
        int inicio = 0;
        int fim = 0;
        int tamMaior = 0;
        int tamanhoAtual = 0;
        char[] letras = s.toCharArray();
        int j = 0;
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            j = i - 1;
            k = i + 1;
            tamanhoAtual = 1;

            while (k < s.length() && j >= 0) {
                System.out.println(j + " " + k);

                if (letras[j] == letras[k]) {
                    tamanhoAtual++;
                    inicio = j;
                    fim = k;
                }

                j--;
                k++;
            }
            if (tamanhoAtual > tamMaior) {
                tamMaior = tamanhoAtual;
                inicio = j;
                fim = k;

            }
        }

        for (int i = 0; i < s.length(); i++) {
            j = i - 1;
            k = i;
            tamanhoAtual = 1;
            while (k < s.length() && j >= 0) {
                System.out.println(j + " " + k);
                if (letras[j] == letras[k]) {
                    tamanhoAtual++;
                }
                j--;
                k++;
            }
            if (tamanhoAtual > tamMaior) {
                tamMaior = tamanhoAtual;
                inicio = j+1;
                fim = k+1;
            }
        }
        System.out.println(s.substring(inicio, fim));
        return s.substring(inicio,fim);
    }
}
