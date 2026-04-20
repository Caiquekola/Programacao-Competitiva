
import java.util.Arrays;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String palavra = scan.nextLine();
            char[] l = palavra.toCharArray();
            Arrays.sort(l);
            String palavraOrdenada = new String(l);
            System.out.println("PALAVRA: "+palavra);
            System.out.println("PALAVRA ORDENADA: "+palavraOrdenada);
            System.out.println(palavra+": "+(palavraOrdenada.equals(palavra)?"O":"N"));
        }
    }
}
