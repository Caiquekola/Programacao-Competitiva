
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortedAdjacentDifferences {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int qntN = sc.nextInt();
            int ns[] = new int[qntN];
            for (int j = 0; j < qntN; j++) {
                ns[j] = sc.nextInt();
            }

            ArrayList<Integer> resposta = new ArrayList<>();
            Arrays.sort(ns);
            int meio = (qntN ) / 2;
            resposta.add(ns[meio]);
            for(int j = 1; resposta.size() < qntN; j++) {
                if(meio - j>=0){
                    resposta.add(ns[meio - j]);
                }
                if(meio + j<qntN){
                    resposta.add(ns[meio + j]);
                }
            }
            for (Integer r : resposta) {
                System.out.print(r+" ");
            }
            System.out.println();
        }

    }
}
