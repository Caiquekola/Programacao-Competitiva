#include <stdio.h>

int main(){
    float a,b,c,d,media,e;
    scanf ("%f %f %f %f",&a,&b,&c,&d);
    media = (a*2.0+b*3.0+c*4.0+d*1.0)/10.0;
    printf("Media: %.1f\n",media);
    if(media>=7)
    {
        printf("Aluno aprovado.\n");
    }
    else if(media<5)
    {
        printf("Aluno reprovado.\n");
    }
    else if (media>=5&media<7)
    {
        printf("Aluno em exame.\n");
        scanf("%f",&e);
        media = (media+e)/2;
        printf("Nota do exame: %.1f\n",media);
        
        if(media>=5)
        {
            printf("Aluno aprovado.\n");
            printf("Media final: %.1f\n",media);
        }
        else if(media<5)
        {
            printf("Aluno reprovado.\n");
            printf("Media final: %.1f\n",media);
        }
    }


}
