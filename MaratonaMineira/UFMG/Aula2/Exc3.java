import java.util.Arrays;
import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int meses[] = new int[12];
        for (int i = 0; i < 12; i++) {
            meses[i] = scan.nextInt();
        }
        int qnt = 0;
        Arrays.sort(meses);

        for (int i = 11; i >=0 ; i--) {
            if(n<=0){
                break;
            }
            qnt++;
            n-=meses[i];
        }
        for (int i : meses) {
            System.out.println(i);
        }
        System.out.println(qnt);
    }
}
