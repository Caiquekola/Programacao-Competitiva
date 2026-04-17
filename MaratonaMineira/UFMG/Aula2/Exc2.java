
import java.util.Scanner;

public class Exc2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            char[] a = scan.nextLine().toCharArray();
            char[] b = scan.nextLine().toCharArray();
            char[] c = scan.nextLine().toCharArray();
            int qntLetras = a.length;
            boolean igual = true;
            for (int j = 0; j < qntLetras; j++) {
                if (a[j] == c[j] || c[j]==b[j]) {
                    continue;
                } 
                igual = false;
                break;
            }
            System.out.println(igual?"YES":"NO");
        }
    }
}
