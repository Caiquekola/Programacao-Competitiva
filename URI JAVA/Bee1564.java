package beeCrowd.Nivel1;

import java.util.Scanner;

public class Bee1564 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resposta;
        while(scan.hasNextLine()){
            resposta = scan.nextLine();
            if(resposta.equals("0")){
                System.out.println("vai ter copa!");
            }else if(resposta.isBlank()){
                break;
            }else{
                System.out.println("vai ter duas!");
            }
        }
    }
}
