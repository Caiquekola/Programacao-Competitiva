
import java.util.Scanner;

public class Exc7 {

    //oddeven
    public static void main(String[] args) {
        //soma impar
        //subtrai par
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            if (x == y) {
                System.out.println(0);
                continue;
            }
            if (x < y) {
                int dif = y - x;
                boolean difEven = dif % 2 == 0;
                // 1 3
                // 1 4 
                // 1 5
                if (difEven) {
                    System.out.println(2);
                } else {
                    System.out.println(1);
                }
            } else {
                int dif = y - x;
                boolean difEven = dif % 2 == 0;
                // 4 1 
                // 3 1 
                // 5 1
                if(difEven){
                    System.out.println(1);
                }else{
                    System.out.println(2);
                }
            }
        }
    }
}
