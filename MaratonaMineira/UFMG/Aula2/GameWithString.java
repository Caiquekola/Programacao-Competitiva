
import java.util.Scanner;

public class GameWithString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        /*
        Examples
InputCopy
abacaba
OutputCopy
No
InputCopy
iiq
OutputCopy
Yes
InputCopy
abba
OutputCopy
No */
        char[] letras = s.toCharArray();
        boolean primeiroGanhou = false;
        for (int i = 0; i < letras.length - 1; i++) {
            if (letras[i] == letras[i + 1]) {
                System.out.println("entrou");
                primeiroGanhou = !primeiroGanhou;
                if (i == 0 && letras.length > 2) {
                    s = s.substring(i + 2);
                    break;
                } else {
                    System.out.println("entrou 2 ");
                    s = s.replaceFirst(s.substring(i,i+1), "");
                    System.out.println(s);
                    break;
                }
            }

        }
        System.out.println(s);
        System.out.println(primeiroGanhou?"Yes":"No");
    }
}
