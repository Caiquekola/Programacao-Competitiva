import java.util.Scanner;

public class Exc6Lista{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntEsteiras = 3;
        int qntColunas = 4;
        int numeroThreads = Runtime.getRuntime().availableProcessors();
        int qntTrabalha = qntColunas / numeroThreads;
        int matriz[][] = new int[qntEsteiras][qntColunas];
        for (int i = 0; i < qntEsteiras; i++) {
            for (int j = 0; j < qntColunas; j++) {
                matriz[i][j] = scan.nextInt();
            }
        }
        int solucao[] = new int[qntColunas];
        for (int i = 0; i < qntColunas; i++) {
            solucao[i] = maior(matriz,i);
            System.out.println(solucao[i]);
        }
        for (int i = 0; i < qntColunas; i++) {
            solucao[i] = maior(matriz,i);
            System.out.println(solucao[i]);
        }
    }
    public static int maior(int[][] matriz, int coluna){
        int maior = 0;
        for(int i = 0; i < matriz[0].length-1;i++){
            if(matriz[i][coluna]>maior){
                maior = matriz[i][coluna];
            }
        }
        return maior;
    }
    
        
}