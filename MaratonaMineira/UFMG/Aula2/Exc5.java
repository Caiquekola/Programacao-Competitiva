
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        //https://br.spoj.com/problems/BRACELMG/
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < n; i++) {
            String seqProibida = scan.next();
            String seq = scan.next();

            boolean ok = apareceNoCirculo(seqProibida,seq) || apareceNoCirculo(seqProibida,new StringBuilder(seq).reverse().toString());
            System.out.println(ok?"S":"N");
        }

    }

    public boolean apareceNoCirculo(String seqP, String seq){
        int nP = seqP.length();
        int nS = seq.length();

        StringBuilder sb = new StringBuilder();
        while(sb.length() < nP + nS - 1){
            sb.append(seq);
        }

        return sb.indexOf(seqP) != -1;
    }
}
