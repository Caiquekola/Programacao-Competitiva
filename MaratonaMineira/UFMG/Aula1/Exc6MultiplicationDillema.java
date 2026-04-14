
import java.util.Scanner;

public class Exc6MultiplicationDillema {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Input
            2
            55 20
            70 17
        Output
            60 x 20 - 5 x 20
            -3 x 70 + 70 x 20

         */
        int n = scan.nextInt();
        int x = 0, y = 0, xc = 0, yc = 0;
        for (int i = 0; i < n; i++) {
            x = scan.nextInt();
            y = scan.nextInt();
            if (x % 10 != 0) {
                if ((x % 10 >= 5)) {
                    xc = x + 10 - xc % 10;
                    System.out.println(xc + " x " + y + " - " + (10 - xc % 10) + " x " + y);
                }
            }
        }
    }
}
