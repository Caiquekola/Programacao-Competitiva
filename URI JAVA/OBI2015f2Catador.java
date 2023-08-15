/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class OBI2015f2Catador {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baldes = scan.nextInt();
        int numOperacoes = scan.nextInt();
        int Total=0;
        int operacoes[] = new int[numOperacoes];
        int conchas[] = new int[baldes];
        for (int i = 0; i < conchas.length; i++) {
            conchas[i] = scan.nextInt();
        }
        int indice0=0,indiceFinal=0;
        for (int i = 0; i < numOperacoes; i++) {
            operacoes[i] = scan.nextInt();
            operacoes[i]--;
            indice0=operacoes[i]-conchas[operacoes[i]];
            indiceFinal=operacoes[i]+conchas[operacoes[i]];
            if(indiceFinal>baldes)indiceFinal=baldes-1;
            
            for (int j = indice0 ; j <= indiceFinal; j++) {
                if(conchas[j]>=1){
                conchas[j]--;
            }
            }
            
        }
        for (int i = 0; i < baldes; i++) {
            Total+=conchas[i];
        }
        System.out.println(Total);
        
    }

}
