import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Exc4Filhos {
    public static void main(String[] args) {
        
    }
    
}   

class Node {
    List<Node> filhos = new LinkedList<>();;
    public Node(){
        filhos = new LinkedList<>();
    }
    //TamanhoLista, Nivel começa com 0
    public int checkarNo(int tamanhoLista, int nivel){
        if(tamanhoLista!=filhos.size){
            return -1;
        }
        List<Integer> listaNiveis = new ArrayList<>();
        int qntFilhos = 0;
        for(Node n : filhos){
            qntFilhos = checkarNo(tamanhoLista, nivel+1);
            listaNiveis.add(qntFilhos);
        }
        if(listaNiveis.isEmpty()){
            return nivel;
        }
        if (listaNiveis.size()!=tamanhoLista) {
            return -1;
        }
        int valorPrimeiro = listaNiveis.get(0);
        for (Integer integer : listaNiveis) {
            if(integer!=valorPrimeiro){
                return -1;
            }
        }
        return nivel + listaNiveis.get(0);
    }
}

/*
 * Implementar um algoritmo para verificar se um objeto é "fractal"
 * Possui uma lista de objetos do mesmo tipo dele: O objeto em questão deve
 * conter uma lista de outros objetos que são do mesmo tipo que ele próprio.
 * Cada objeto da lista também possui listas, e todas devem ter o mesmo tamanho:
 * Cada um dos objetos contidos na lista do objeto principal deve, por sua vez,
 * também conter listas. Além disso, todas essas listas aninhadas devem ter o
 * mesmo número de elementos.
 * Todas as listas devem ter o mesmo número de objetos: Todas as listas
 * envolvidas na estrutura (tanto a lista principal quanto as listas aninhadas)
 * devem possuir a mesma quantidade de objetos.
 * Todas as listas da lista devem ter a mesma profundidade: A profundidade de
 * aninhamento das listas dentro da estrutura deve ser uniforme. Ou seja, todas
 * as "ramificações" da estrutura de listas devem ter o mesmo nível de
 * profundidade.
 * Cada lista não é toda nula (para finalizar o fractal) ou todas as suas
 * posições contêm objetos instanciados
 */