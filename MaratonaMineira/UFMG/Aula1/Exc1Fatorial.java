import java.util.Scanner;

public class Exc1Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int resposta = 1;
        if(N<=1){
            System.out.println(1);
        }else{
            for (int i = N; i > 1; i--) {
                resposta *= i;
            }
            System.out.println(resposta);
        }
    }
    /*
     * Exemplos de Entrada Exemplos de Saída
     * 0
     * 1
     * 
     * 1
     * 1
     * 
     * 5
     * 120
     * 
     * 6
     * 720
     */
}
