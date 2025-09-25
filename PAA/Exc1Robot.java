import java.util.Scanner;

public class Exc1Robot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamanhoMatriz = scan.nextInt();
        int numeroRobos = scan.nextInt();
        System.out.println(tamanhoMatriz + " " + numeroRobos);
        int posColObj = scan.nextInt();
        int posLinObj = scan.nextInt();
        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
        matriz[posColObj][posLinObj] = 0;
        // 0 Objeto, -1 Robo
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        int areaDividia = tamanhoMatriz / numeroRobos;
        int posLinRob[] = new int[numeroRobos];
        int posColRob[] = new int[numeroRobos];
        for (int i = 0; i < numeroRobos; i++) {
            posColRob[i] = i * areaDividia;
            posLinRob[i] = 0;
        }
        int increment = -1;
        int i = 0;
        boolean encontrou = false;
        while (!encontrou) {
            for (int j = 0; j < numeroRobos; j++) {
                while(posLinRob[j]<areaDividia){
                    
                }
            }
            
        }

    }

}
