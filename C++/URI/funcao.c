#include <stdio.h>

int modulo(int a){
    if(a>0){
        return a;
    }
    return -a;
}

int main(){
    int x,y;
    scanf("%d",&x);
    printf("O modulo do numero e %d",modulo(x));

