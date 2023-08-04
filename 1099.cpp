#include <iostream>

using namespace std;

int main(){
    int N=0,x=0,y=0,soma=0;
    scanf("%d",&N);
    for (int j = 0; j < N; j++)
    {   
        scanf("%d %d",&x,&y);
        if(y>x){
            for (int i = x+1; i < y; i++)
            { 
                if(i%2!=0){
                    soma+=i;
                }
            }
        }else if(x>y){
            for (int i = y+1; i < x; i++)
            {
                if(i%2!=0){
                    soma+=i;
                }
            }
        }
        printf("%d\n",soma);
        soma=0;
    }
    
    
    
}

