#include <stdio.h>
 
int main() {
 
    double S = 1;
    
    int i = 2;
    
        for(int j = 3; j <= 39; j+=2){
            S += (j)/i;
            i*=2;
        }
        
    
    printf("%.2f\n",S);
 
    return 0;
}