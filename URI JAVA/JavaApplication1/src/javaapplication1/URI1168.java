
package javaapplication1;

import java.util.Scanner;
public class URI1168 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int led=0;
        String X;
        int N = scan.nextInt();
        for (int i = 0; i < N; i++) {
            X = scan.next();
            for (int j = 0; j < X.length(); j++) {
                if(X.charAt(j)=='1')led+=2;
                if(X.charAt(j)=='3'||X.charAt(j)=='2')led+=5;
                if(X.charAt(j)=='4'||X.charAt(j)=='7')led+=4;
                if(X.charAt(j)=='6'||X.charAt(j)=='9'||X.charAt(j)=='0')led+=6;
                if(X.charAt(j)=='8')led+=7;
                if(X.charAt(j)=='5')led+=5;
                
            }
            System.out.println(led+ "leds");
            led=0;
        }
    }
    
}
