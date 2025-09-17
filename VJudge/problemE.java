import java.util.Scanner;

public class problemE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int contador = 0;
        
        //a^4 - 2na² + a + n² - m = 0
        int termoIndependente = n*n - m;
        
        for(int i = 0; i < termoIndependente; i++){

        }

        while(termoIndependente>=1){
            termoIndependente *= -1;
            int resposta = (int)(Math.pow(termoIndependente, 4)- (2*n*(termoIndependente*termoIndependente))+termoIndependente+(n*n)-m);
            termoIndependente *= -1;
            int resposta2 = (int)(Math.pow(termoIndependente, 4)- (2*n*(termoIndependente*termoIndependente))+termoIndependente+(n*n)-m);
            if(resposta == 0 || resposta2 == 0){
                contador++;
            }
            System.out.println(resposta2);
            System.out.println(resposta);
            System.out.println(termoIndependente);
        }
        System.out.println(contador);
    }
}
