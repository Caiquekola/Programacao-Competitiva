package beeCrowd.Nivel1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class Bee184 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char SorM = scan.next().charAt(0);
        double values[][] = new double[12][12];
        double sum=0;
            for (int i = 0; i < 12; i++) {
                for (int j = 0; j < 12; j++) {
                    values[i][j] = scan.nextDouble();
                    if(i>j){
                        sum+=values[i][j];
                    }

                }
            }
        if(SorM == 'S'){
            System.out.printf("%.1f\n",sum);
        } else if (SorM == 'M') {
            System.out.printf("%.1f\n",(sum/66));
        }


    }
}
