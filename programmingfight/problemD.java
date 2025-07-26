import java.util.Scanner;

public class problemD {
    public static boolean ehVogal(char letra) {
        return letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        scan.nextLine(); 

        for (int i = 0; i < N; i++) {
            String nome = scan.nextLine();
            char[] letras = nome.toCharArray();
            int tam = letras.length;
            boolean nomeValido = true;
            for (int j = 1; j < tam; j++) {
                if (ehVogal(letras[j]) == ehVogal(letras[j - 1])) {
                    nomeValido = false;
                    break; 
                }
            }
            if (nomeValido) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
    }
}