#include <stdio.h>

int main(){
    
    char R[2];
    int coluna=0,valor=4;
    float matriz[valor][valor], soma=0;
    scanf("%d",&coluna);
    scanf("%s",&R);
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
                    printf("Coluna: %d",coluna);
    for (int i = 0; i < valor; i++)
    { 
            soma+=matriz[i][coluna];   
    }
    if(R[0]=='S'){
        printf("%.1f\n",soma);
    }else if(R[0]=='M'){
        soma/=valor;
        printf("%.1f\n",soma);
    }
}