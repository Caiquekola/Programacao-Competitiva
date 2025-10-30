import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exc1Guloso{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tamMatriz = 4;
        int qntObjeto = 4;
        char[][] matriz = new char[tamMatriz][tamMatriz];
        
        List<Objeto> objetos = new ArrayList<>();
        for (int i = 0; i < qntObjeto; i++) {
            String letras = scan.next();
            int qntDisponivel = scan.nextInt();
            double valor = scan.nextDouble();
            objetos.add(new Objeto(letras,qntDisponivel,valor));
        }

        Collections.sort(objetos,(a,b)->Double.compare((a.valor/a.letras.length()),(b.valor/b.letras.length())));
        Collections.reverse(objetos);
        

        System.out.println(objetos);

        int objIndx = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                if(!objetos.isEmpty()&&objetos.get(objIndx).letras.length()<matriz.length-j-1){
                    for (int k = j; k < j+objetos.get(objIndx).letras.length(); k++) {
                        matriz[i][k] = objetos.get(objIndx).letras.charAt(0);
                        System.out.print(matriz[i][k]+" ");
                    }
                    objetos.get(objIndx).qntDisponivel--;
                    j = j+objetos.get(objIndx).letras.length();
                }else{
                    
                    objIndx = objetos.size()%++objIndx;
                }
                exibirMatriz(matriz);
            }
            System.out.println();
        }
    }
    public static void exibirMatriz(char[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
    }
    static class Objeto{
        String letras;
        int qntDisponivel;
        double valor;
        public Objeto(String l, int q, double v){
            this.letras = l;
            this.qntDisponivel = q;
            this.valor = v;
        }
        @Override
        public String toString() {
            return "{"+letras +" " +qntDisponivel+" " + valor+"}";
        }
    }
}
