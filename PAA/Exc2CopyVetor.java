import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exc2CopyVetor {
    public static void main(String[] args) {
        int tamanhoVetor = 10000;
        int qntTestes = 3;
        Set<Double> tempos = new TreeSet<>(new Comparator<Double>() {
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        });

        for (int j = 0; j < qntTestes; j++) {
            int[] vetor = new int[tamanhoVetor];
            for (int i = 0; i < tamanhoVetor; i++) {
                vetor[i] = (int) (Math.random() * 500);
                // System.out.print(vetor[i] + " ");
            }
            // System.out.println();
            int[] vetorCopy = new int[tamanhoVetor];
            long initTime = System.nanoTime();
            vetorCopy = Arrays.copyOf(vetor, tamanhoVetor);
            long finalTime = System.nanoTime();
            System.out.print("Arrays.copyOf: " + (double) ((finalTime - initTime) / Math.pow(10, 6)));
            vetorCopy = new int[tamanhoVetor];
            initTime = System.nanoTime();
            vetorCopy = vetor.clone();
            finalTime = System.nanoTime();
            System.out.print("Vetor.clone: " + (double) ((finalTime - initTime) / Math.pow(10, 6)));
            vetorCopy = new int[tamanhoVetor];
            initTime = System.nanoTime();
            System.arraycopy(vetor, 0, vetorCopy, 0, tamanhoVetor);;
            finalTime = System.nanoTime();
            System.out.print("System.arraycopy: " + (double) ((finalTime - initTime) / Math.pow(10, 6)));

            System.out.println();
            // tempos.add((double) ((finalTime - initTime) / Math.pow(10, 6)));
        }
        // for (Double d : tempos) {
        //     System.out.print(d + " ");
        // }
        // System.out.println((finalTime - initTime) / Math.pow(10, 6) + " ms");
    }
}
