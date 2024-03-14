/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buscabinaria;

import java.util.Arrays;
import java.util.Scanner;

public class URI1025CAP4 {

    public int buscaBinaria(int vetor[], int item) {
        int inicio = 0;
        int fim = vetor.length;
        return busca(vetor, item, inicio, fim);
    }

    private int busca(int vetor[], int item, int e, int d) {
        int m = (e + d) / 2;
        if (m == item) {
            return m;
        }
        if (item > vetor[item]) {
            return busca(vetor, item, m + 1, d);
        } else {
            return busca(vetor, item, e, m - 1);
        }

    }
//    private int[] insertionSort(int vetor[]){
//        int i = 0, j = 1;
//        while(j<vetor.length-1){
//            int aux = vetor[j];
//            i = j-1;
//        }
//    }

    public static void main(String[] args) {
        int nMarble = 1, nCasos = 1, cont = 1;
        Scanner scan = new Scanner(System.in);
        while (nMarble != 0 && nCasos != 0) {
            nMarble = scan.nextInt();
            nCasos = scan.nextInt();
            if(nMarble != 0 && nCasos != 0){
                break;
            }
            int marble[] = new int[nMarble];
            int casos[] = new int[nCasos];

            for (int i = 0; i < nMarble; i++) {
                marble[i] = scan.nextInt();
            }
            Arrays.sort(marble);
            //System.out.println(Arrays.toString(marble));
            System.out.printf("CASE# %d:\n", cont);
            cont++;
            for (int i = 0; i < nCasos; i++) {
                casos[i] = scan.nextInt();
                int local = Arrays.binarySearch(marble, casos[i])+1;
                if (local >= 0) {
                    System.out.printf("%d found at %d\n", casos[i], local);
                } else {
                    System.out.printf("%d not found\n", casos[i]);
                }
            }
        }

    }
}
