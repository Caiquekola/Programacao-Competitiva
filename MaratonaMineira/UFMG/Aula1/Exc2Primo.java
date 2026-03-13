import java.util.Scanner;

public class Exc2Primo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean ehPrimo = true;
        if (n <= 3) {
            ehPrimo = true;
        } else if (n % 2 == 0) {

            ehPrimo = false;
        } else {
            for (int i = 3; i * i <= n; i = i + 2) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
        System.out.println(ehPrimo ? "sim" : "nao");

    }
}
