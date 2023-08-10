#include <stdio.h>

/*Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de 
valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o 
valor armazenado naquela posição.
3

N[0] = 0N[1] = 1N[2] = 2N[3] = 0N[4] = 1N[5] = 2N[6] = 0N[7] = 1N[8] = 2
...
*/

int main(){
    int N[5];
    int T=0,cont=0;
    scanf("%d",&T);
    for (int i = 0; i < 5; i++)
    {
        printf("N[%d] = %d",i,cont);
        cont++;
        if(cont==T){
            cont=0;
        }
        
    }
    
}