package noicobi;

import java.util.Scanner;
public class OBI21TorneioTenis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char jogo;
        int soma=0;
        for (int i = 0; i < 6; i++) {
            jogo = scan.next().charAt(0);
            if(jogo=='V'){
                soma++;
            }
        }
        if(soma>=5){
            System.out.println(1);
        }else if(soma==3|soma==4){
            System.out.println(2);
        }else if(soma==1|soma==2){
            System.out.println(3);
        }else{
            System.out.println(-1);
        }
        
    }
    
}
