import java.util.Scanner;

public class problemB {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        int N = scan.nextInt();

        int a = 1;
        int b = 1;
        int aux = 0;
        if (N == 1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < N-1; i++) {
                aux = a;
                a = b;
                b = aux + b;
                
            }
            System.out.println(b);
        }
        
    }
}
