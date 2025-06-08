package desafio;

import java.util.Queue;
import java.util.LinkedList;
public class LeetCode1298 {
    public static void main(String[] args) {
        int status[] = {1, 0, 1, 0};
        int candies[] = {7, 5, 4, 100};
        int keys[][] = {{}, {}, {1}, {3}};
        int containedBoxes[][] = {{1,2}, {3}, {}, {}};
        int initialBoxes[] = {0};

        System.out.println(maxCandies(status, candies, keys, containedBoxes, initialBoxes));
    }

    public static int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes,
            int[] initialBoxes) {
                Queue<Integer> boxes = new LinkedList<>();
                for(int i: initialBoxes){
                    boxes.add(i);
                }
        int sum = 0;
                int tamanho = boxes.size();
        for (int ks = 0; ks < keys[boxes.peek()].length; ks++) {
            status[keys[boxes.peek()][ks]] = 1;
            System.out.println("CAIXA ABERTA " + keys[boxes.peek()][ks]);

        }
        while (!boxes.isEmpty()) {
            int caixaAtual = boxes.remove();
            System.out.println("CAIXA ATUAL "+caixaAtual);
            if (status[caixaAtual] == 1) {
                System.out.println("CAIXA SOMADA "+caixaAtual);
                sum += candies[caixaAtual];
                // keys abrirem ela mesma

                // containedBoxes -> abrir caixas, keys
                int cntdBxsL = containedBoxes[caixaAtual].length;
                // abrir caixas
                for (int cntdBxs = 0; cntdBxs < cntdBxsL; cntdBxs++) {
                    for (int ks = 0; ks < keys[containedBoxes[caixaAtual][cntdBxs]].length; ks++) {
                        if(containedBoxes[caixaAtual][cntdBxs]==keys[caixaAtual][ks]){
                            status[keys[containedBoxes[caixaAtual][cntdBxs]][ks]] = 1;
                            System.out.println("CAIXA ABERTA " + status[keys[containedBoxes[caixaAtual][cntdBxs]][ks]]);

                        }
                    }
                }
                // somar caixas caso estiver aberta
                for (int cntdBxs = 0; cntdBxs < cntdBxsL; cntdBxs++) {
                    if (status[containedBoxes[caixaAtual][cntdBxs]] == 1) {
                        boxes.add(containedBoxes[caixaAtual][cntdBxs]);
                        System.out.println("CAIXA ADICIONA "+ containedBoxes[caixaAtual][cntdBxs]);
                    }
                }

            }
            tamanho = boxes.size();
            System.out.println("Tamanho caixa"+tamanho);
        }

        return sum;
    }
}