#include <stdio.h>

int main(){
    char R[1];
    scanf("%s",&R[0]);
    int valor=4,contador=0,cont=1;
    float matriz[valor][valor],soma=0;
    for (int i = 0; i < valor; i++)
    {
        for (int j = 0; j < valor; j++)
        {
            scanf("%f",&matriz[i][j]);
        }
        
    }
    for (int i = 1; i < valor; i++)
    {
        for (int j = valor - i; j < valor; j++)
        {
            soma+=matriz[i][j];
            contador++;
            
        }
        
    }
    if(R[0]=='S'){
        printf("%.1f",soma);
    }else if(R[0]=='M'){
        soma/=contador;
        printf("%.1f\n",soma);
    }
}