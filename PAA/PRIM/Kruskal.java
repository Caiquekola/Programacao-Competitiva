public class Kruskal {
    
    public static void main(String[] args){
        int[][] grafo = {{ 0, 1, 4, 7, 0},
                         { 1, 0,  5,  0, 3},
                         {4, 5,  0, 0, 2},
                         {7, 0, 0,  0, 9},
                         { 0, 3,  2, 9, 0}
                        };
        algoritmoKruskal(grafo);
    }
    
    public static int[][] algoritmoKruskal(int[][] grafo){
        int[][] arvoreGeradoraMinima = new int[grafo.length][grafo.length];
        int[] verticesVisitados = new int[grafo.length];
        
        boolean todosVerticeVisitados = false;
        
        while(!todosVerticeVisitados){
            //encontra a menor aresta
            int min = Integer.MAX_VALUE;
            int minl = 0, minc = 0;
            boolean encontrado = false;
            for(int l = 0; l < grafo.length; l++){
                for(int c = 0; c < grafo[0].length; c++){
                    if(grafo[l][c] != 0 && grafo[l][c] < min){
                        minl = l;
                        minc = c;
                        min = grafo[l][c];
                        encontrado = true;
                    }
                }
            }
            
            if(!encontrado){
                todosVerticeVisitados = true;
                continue;
            }
            
            System.out.println("menor vértice encontrado "+minl+"--------"+minc+"  peso:"+grafo[minl][minc]);
            
            //verifica se não vai gerar ciclo:
           int[] visitados = new int[arvoreGeradoraMinima.length];
           boolean ciclo = buscaProfundidade(arvoreGeradoraMinima, visitados, minl, minc);
           if(!ciclo){
                //não possui ciclo
                arvoreGeradoraMinima[minl][minc] = grafo[minl][minc];
                arvoreGeradoraMinima[minc][minl] = grafo[minc][minl];
                verticesVisitados[minl] = 1;
                verticesVisitados[minc] = 1;
                System.out.println("adicionado na árvore");
            }else{
                System.out.println("gera um ciclo, não pode ser adicionado");
            }
            
            //tira a aresta do grafo:
            grafo[minl][minc] = 0;
            grafo[minc][minl] = 0;
        }
        
        printGrafo(arvoreGeradoraMinima);
        
        return arvoreGeradoraMinima;
    }
    
    public static boolean buscaProfundidade(int[][] grafo, int[] visitados, int vCorrente, int busca){
        visitados[vCorrente] = 1;
        for(int c = 0; c < grafo.length; c++){
            if(grafo[vCorrente][c] != 0 && visitados[c]!= 1){
                if(c == busca){
                    return true;
                }
                boolean ret = buscaProfundidade(grafo, visitados, c, busca);
                if(ret)
                  return true;
            }
        }
        return false;
    }

    
    public static void printGrafo(int[][] grafo){
        for(int l = 0; l < grafo.length; l++){
                for(int c = 0; c < grafo[0].length; c++){
                    System.out.print(grafo[l][c] + " -> ");
                }
                System.out.println();
        }
    }
}