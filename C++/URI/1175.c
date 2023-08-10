#include <stdio.h>

int main(){
    int n=5,aux=0;
    int vetor[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&vetor[i]);
    }
    n--;
    for (int i = n; i >= 0; i--)
    {

        printf("N[%d] = %d\n",aux,vetor[i]);
        aux++;
    }

}