
import java.util.HashSet;
import java.util.Scanner;


public class Exc6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> hs = new HashSet<>();
        int a = scan.nextInt(); scan.nextLine();  int av[] = new int[a];
        for (int i = 0; i < a; i++) {
            av[i] = scan.nextInt();
            scan.nextLine();
            hs.add(av[i]);
        }
        int b = scan.nextInt(); scan.nextLine(); int bv[] = new int[b];
        for (int i = 0; i < b; i++) {
            bv[i] = scan.nextInt();
            scan.nextLine();
            hs.add(bv[i]);
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int sum = av[i] + bv[j];
                if(!hs.contains(sum)){
                    System.out.println(av[i] + " " + bv[j]);
                    break;
                }
            }
        }
    }
}
