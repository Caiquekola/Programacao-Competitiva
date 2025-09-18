import java.util.Scanner;

public class Exc1Robot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoMatriz = scan.nextInt();
        int numeroRobos = scan.nextInt();
        System.out.println(tamanhoMatriz+" "+numeroRobos);
        int posColObj = scan.nextInt();
        int posLinObj = scan.nextInt();
        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        int areaDividia = tamanhoMatriz / numeroRobos;
        

    }
}
