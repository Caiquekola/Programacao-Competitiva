
package obi2021a;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class OBI2021A {

    
    public static void main(String[] args) {
        int vitoria=0, derrota=0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<6; i++){
            String partida = scan.nextLine();
            if(partida.equals("V")){
            vitoria++;
            }
        }
        if(vitoria==5||vitoria==6){
            System.out.print("1");
        }else if(vitoria==3 || vitoria==4){
            System.out.print("2"); 
        }else if(vitoria==1 || vitoria==2){
            System.out.print("3"); 
        }else if(vitoria==0){
            System.out.println("-1");
        }
        
        
        
    }
    
}
