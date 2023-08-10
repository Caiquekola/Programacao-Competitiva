#include <stdio.h>

int main(){
    double a;
    double N[100];
    scanf("%lf",&a);
    for (int i = 0; i < 100; i++)
    {
        N[i] = a;
        printf("N[%d] = %.4lf\n",i,N[i]);
        a/=2;
        
    }
    
}