#include <stdio.h>

int main(){
    char R[1];
    scanf("%s",&R[0]);
    printf("%s",R);
    int valor=4,contador=0;
    float matriz[valor][valor],soma=0;
    for (int i = 0; i < valor; i++)
    {
        for (int j = 0; j < valor; j++)
        {
            scanf("%f",&matriz[i][j]);
        }
        
    }
    for (int i = 0; i < valor; i++)
    {
        for (int j = i+1; j < valor; j++)
        {
            soma+=matriz[i][j];
            contador++;
        }
        
    }
    if(R[0]=='S'){
        printf("%.1f",soma);
    }else if(R[0]=='M'){
        soma/=contador;
        printf("%.1f",soma);
    }
}