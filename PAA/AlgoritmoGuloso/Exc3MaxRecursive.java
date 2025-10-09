import java.util.Arrays;
import java.util.Collections;

public class Exc3MaxRecursive {

    public static void main(String[] args) {
        int tamVetor = 100;
        int[] vetor = new int[tamVetor];
        for (int i = 0; i < tamVetor; i++) {
            vetor[i] = (int)Math.random() * 100;
        }

        long initTime = System.nanoTime();
        int max = vetor[0]; // Assume the first element is the maximum initially
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > max) {
                max = vetor[i]; // Update max if a larger element is found
            }
        }
        long finalTime = System.nanoTime();
        System.out.print("Collections.max: " + (double) ((finalTime - initTime) / Math.pow(10, 6)));
        System.out.println();
        initTime = System.nanoTime();
        Arrays.stream(vetor).max();
        finalTime = System.nanoTime();
        System.out.print("Arrays.stream(vector).max(): " + (double) ((finalTime - initTime) / Math.pow(10, 6)));
        System.out.println();

        initTime = System.nanoTime();
        int maior = maxRecursive(vetor, 0, tamVetor-1);
        finalTime = System.nanoTime();
        System.out.print("maiorRecursivo: " + (double) ((finalTime - initTime) / Math.pow(10, 6)));
        System.out.println();

    }

    public static int maxRecursive(int[] vetor, int p, int r) {
        if (p == r) {
            return vetor[p];
        }else{
            int q = (p+r)/2;
            int maior1 = maxRecursive(vetor, p, q);
            int maior2 = maxRecursive(vetor, q+1, r);
            if (maior1>maior2) {
                return maior1;
            }else{
                return maior2;
            }
        }
    }
}