import java.util.Scanner;

public class problemD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int a=0, b=0, contador;
        for (int i = 0; i < t; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            contador = 0;
            while(a%b!=0){
                a++;
                contador++;
            }
            System.out.println(contador);
        }
    }
}
