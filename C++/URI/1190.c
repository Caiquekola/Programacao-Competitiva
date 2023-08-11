#include <stdio.h>

int main(){
    char resposta;
    int valor =12;
    float matriz[valor][valor],soma=0;
    scanf("%s",&resposta);
    for (int i = 0; i < valor; i++)
    {
        for (int j = 0; j < valor; j++)
        {
            scanf("%f",&matriz[i][j]);
        }
    }

    for (int i = 0; i < valor; i++)
    {
        for (int j = 0; j < valor; j++)
        {
            printf("%.1f ",matriz[i][j]);
        }
        printf("\n");
        
    }
    for (int i = 1; i < valor/2; i++)
    {
        for (int j = valor - i; j < valor; j++)
        {
            soma+=matriz[i][j];
        }
    }
    for (int i = valor/2; i < valor; i++)
    {
        for (int j = valor - 1; j > valor; j--)
        {
            soma+=matriz[i][j];
        }
    }
    printf("%f",soma);
}
