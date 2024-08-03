package tree;

import java.util.Scanner;

public class NOICAula1Irmaos {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        if(N>=M){
                       System.out.println(Math.abs(N-M)+N);
        }else{
                       System.out.println(Math.abs(M-N)+M);
        }
        
    }
    
}
