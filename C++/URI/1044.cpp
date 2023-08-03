#include <iostream>
using namespace std;

main(){
    int x,y;
    cin>>x>>y;
    
    if(x%y==0|y%x==0|x==0){
            cout<<"Sao multiplos"<<endl;
    }
    else
    {
        cout<<"Nao sao multiplos"<<endl;
    }

}