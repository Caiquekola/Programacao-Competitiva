#include <stdio.h>

int main(){
    int N=0, menor=9999999,posicao=0;
    scanf("%d",&N);
    int v[N];
    for (int i = 0; i < N; i++)
    {
        scanf("%d",&v[i]);
        if(v[i]<menor){
            menor=v[i];
            posicao=i;
        }
    }
    printf("Menor valor: %d\n",menor);
    printf("Posicao: %d",posicao);
}