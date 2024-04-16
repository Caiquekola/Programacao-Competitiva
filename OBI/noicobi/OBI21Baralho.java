package noicobi;
import java.util.Scanner;
import java.util.ArrayList;
public class OBI21Baralho {
    public static void main(String[] args) {
        
        //Saida: C,E,U,P; 0 , erro duplica, faltando, n de cartas faltando;
        
        Scanner scan = new Scanner(System.in);
        String cartas = scan.next();
        ArrayList<Integer> C = new ArrayList<Integer>();
        ArrayList<Integer> E = new ArrayList<Integer>();
        ArrayList<Integer> U = new ArrayList<Integer>();
        ArrayList<Integer> P = new ArrayList<Integer>();
        boolean Cerror=false, Eerror=false, Uerror=false, Perror=false;
        for (int i = 0; i < cartas.length(); i+=3) {
            if(cartas.charAt(i+2)=='C'){
                   if(C.contains((Integer.parseInt(cartas.substring(i,i+2))))){
                       Cerror=true;
                   }else{
                       C.add((Integer.parseInt(cartas.substring(i,i+2))));}
            }else if(cartas.charAt(i+2)=='E'){
                   if(E.contains((Integer.parseInt(cartas.substring(i,i+2))))){
                       Eerror=true;
                   }else{
                        E.add((Integer.parseInt(cartas.substring(i,i+2))));}
            }else if(cartas.charAt(i+2)=='U'){
                   if(U.contains((Integer.parseInt(cartas.substring(i,i+2))))){
                       Uerror=true;
                   }else{
                       U.add((Integer.parseInt(cartas.substring(i,i+2))));}
            }else if(cartas.charAt(i+2)=='P'){
                   if(P.contains((Integer.parseInt(cartas.substring(i,i+2))))){
                       Perror=true;
                   }else{
                       P.add((Integer.parseInt(cartas.substring(i,i+2))));}
            }
        }
        if(Cerror==true){
            System.out.println("erro");
        }else{
            System.out.println(13-C.size());
        }
        if(Eerror==true){
            System.out.println("erro");
        }else{
            System.out.println(13-E.size());
        }
        if(Uerror==true){
            System.out.println("erro");
        }else{
            System.out.println(13-U.size());
        }
        if(Perror==true){
            System.out.println("erro");
        }else{
            System.out.println(13-P.size());
        }
        
        
    }
    
    
}
