#include <iostream>
using namespace std;

int main(){
    int x=0,y=-1;
    while(x!=y){
        
        scanf("%d %d",&x,&y);
        if(x<y){
            printf("Crescente\n");
        }else if(x>y){
            printf("Decrescente\n");
        }
    }
}