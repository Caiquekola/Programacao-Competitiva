 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;
public class OBI2014f2 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String horarios = scan.nextLine();
        horarios = horarios.replace(" ","");
        String[] horas = new String[4];
        int j=0;
        int time[] = new int[4];
        for (int i = 0; i < horas.length; i++) {
            horas[i] = horarios.substring(j,j+2);
            j+=5;
            time[i] = Integer.parseInt(horas[i]);
        }
       int horaT1, horaT2;
       if(time[0]<time[1]){ horaT1 = time[1]-time[0];} else horaT1 = time[0]-time[1];
       if(time[2]<time[3]){ horaT2 = time[3]-time[2];} else horaT2 = time[2]-time[3];
       int M;
       if(horaT1>horaT2){M = (horaT1-horaT2)/2;
       }else {M = (horaT2-horaT1)/2;}
       if(time[2]<time[3])
       System.out.println(M);
       else System.out.println(-M);
       
        
    }

}
