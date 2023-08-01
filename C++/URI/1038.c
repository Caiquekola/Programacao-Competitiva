#include <stdio.h>

int main(){
    int x, y;
    float r;
    scanf("%d %d",&x,&y);
    switch(x){
        case 1:
            r = 4.0 * y;
            break;
        case 2: 
            r = 4.5 * y;
            break;
        case 3:
            r = 5.0 * y;
            break;
        case 4:
            r = 2.0 * y;
            break;
        case 5:
            r = 1.5 * y;
            break;
        default:
            break;

    }

    printf("Total: R$ %.2f",r);
}