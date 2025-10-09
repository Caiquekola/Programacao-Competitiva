import java.util.Scanner;

public class Exc6Lista{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qntEsteiras = 3;
        int qntColunas = 4;
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

    public static int intMaiorVizinho(int[][] matriz, int linha, int coluna){
        int maior=0;
        int qntLinhas = matriz.length;
        if(linha==0&&matriz[0].length>1){
            return Math.max(matriz[0][coluna], matriz[1][coluna]);
        }else if(linha==matriz.length-1){
            return Math.max(matriz[qntLinhas-1][coluna], matriz[qntLinhas-2][coluna]);
        }else{
            return Math.max(matriz[linha][coluna], qntLinhas);
        }
    }
    
        
}