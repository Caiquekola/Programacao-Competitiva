#include <stdio.h>

int main(){
    int N=0,aux1=0,aux2=0;
    int vP[5],vI[5];
    //aux1 é para Par, aux2 é para Impar
    for (int i = 0; i < 15; i++)
    {
        scanf("%d",&N);
        if(N%2==0){
            vP[aux1]=N;
            aux1++;
            if(aux1>4){
                for (int j = 0; j < 5; j++)
                {
                    printf("par[%d] = %d\n",j,vP[j]);
                }
                aux1=0;
            }
            
        }else{
            vI[aux2]=N;
            aux2++;
            if(aux2>4){
                for (int j = 0; j < 5; j++)
                {
                    printf("impar[%d] = %d\n",j,vI[j]);
                }
                aux2=0;
            }
            
        }
    }
    
    for (int j = 0; j < aux2; j++)
    {
        printf("impar[%d] = %d\n",j,vI[j]);
    }
    for (int j = 0; j < aux1; j++)
    {
        printf("par[%d] = %d\n",j,vP[j]);
    }
    
}