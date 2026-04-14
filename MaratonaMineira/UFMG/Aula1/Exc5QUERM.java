
import java.util.Scanner;

public class Exc5QUERM {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var n = -1;
        int nTeste = 1;
        n = scan.nextInt();
        while (n != 0) {

            var resp = -1;
            var teste = -1;
            for (int i = 0; i < n; i++) {
                resp = scan.nextInt();
                if (resp == i + 1) {
                    teste = resp;
                }
            }
            System.out.println("Teste " + nTeste);
            nTeste++;
            System.out.println(teste);
            System.out.println();
            n = scan.nextInt();
        }
    }
}
