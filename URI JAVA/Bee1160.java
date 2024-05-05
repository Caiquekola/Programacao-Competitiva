package beeCrowd.Nivel1;

import java.util.Locale;
import java.util.Scanner;

public class Bee1160 {

    public static void main(String[] args) {
        long T; //Casos testes
        long PA, PB,contador=0;
        double G1,G2;

        Scanner scan =  new Scanner(System.in);
        scan.useLocale(Locale.US);
        T = scan.nextInt();
        for (int i = 0; i < T; i++) {
            PA = scan.nextLong();
            PB = scan.nextLong();
            G1 = scan.nextDouble();
            G2 = scan.nextDouble();
            contador = 0;
            do{
                PA += PA*(G1/100);
                PB += PA*(G2/100);
                contador++;
                System.out.println("PA:"+ PA);
                System.out.println("PB: "+ PB);
            }while(PB>=PA&contador!=100);
            if(contador==100){

                System.out.println(PA);
                System.out.println(PB);

                System.out.println("Mais de 1 seculo.");
            }else{
                System.out.println(PA);
                System.out.println(PB);
                System.out.println(contador+".");
            }

        }


    }
}
