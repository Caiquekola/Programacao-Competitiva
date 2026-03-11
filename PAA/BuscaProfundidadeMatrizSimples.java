
public class BuscaProfundidadeMatrizSimples {
    public static void main(String[] args){
    int[][] grafo = {{0, 1, 1, 0, 0, 0, 0, 0},
                     {1, 0, 0, 0, 1, 1, 0, 0},
                     {1, 0, 0, 1, 0, 0, 0, 0},
                     {0, 0, 1, 0, 0, 0, 0, 0},
                     {0, 1, 0, 0, 0, 1, 1, 0},
                     {0, 1, 0, 0, 1, 0, 1, 1},
                     {0, 0, 0, 0, 1, 1, 0, 1},
                     {0, 0, 0, 0, 0, 1, 1, 0}
                        };
        int[] visitados = new int[grafo.length];//marca os vértices que já foram acessados
        buscaProfundidade(grafo, visitados, 0);
    }
    
    public static void buscaProfundidade(int[][] grafo, int[] visitados, int vCorrente){
        System.out.println("visitando "+(vCorrente+1)+ "");
        visitados[vCorrente] = 1;
        for(int c = 0; c < grafo.length; c++){
            if(grafo[vCorrente][c] != 0 && visitados[c]!= 1){
                //System.out.println("----> descendo em "+c+ "");
                buscaProfundidade(grafo, visitados, c);
            }
        }
    }
}
