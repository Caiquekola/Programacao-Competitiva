package org.example.MaratonaMineira;

import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        int n=0, l=0;

        n = new Scanner(System.in).nextInt();
        l = new Scanner(System.in).nextInt();
        int[] filhos = new int[n];

        for(int i = 0; i<n; i++){
            filhos[i] = new Scanner(System.in).nextInt();
        }

        int mQnt = 0, contador = 0, soma = 0;

        for(int i = 0; i < n; i++){
            soma = 0;
            contador=0;
            for(int j = i; j<n;j++){
                soma += filhos[j];
                if(soma<l){
                    contador++;
                }else{
                    break;
                }
            }
            if(contador>mQnt){
                mQnt = contador;
            }
        }
        System.out.println(mQnt);

    }
}
