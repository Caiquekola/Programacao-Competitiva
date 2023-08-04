#include <iostream>

using namespace std;

int main(){
    float N,x,y,z,media=0;
    cin>>N;
    for (int i = 0; i < N; i++)
    {
        cin>>x>>y>>z;
        media=(x*2+y*3+z*5)/10;
        printf("%.1f\n",media);
    }
    

}