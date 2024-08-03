package tree;

import java.util.Scanner;

public class NOICAula1DivisaoDoTesouro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int capitao = (N/(M+2))*2;
        System.out.println(capitao);
    }
    
}
