import java.util.Scanner;

public class Exc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] be = new int[61];
        int[] bd = new int[61];
        for (int i = 0; i < n; i++) {
            int nb = sc.nextInt();
            char l = sc.next().charAt(0);

            if(l=='E'){
                be[nb]++;
            }else{
                bd[nb]++;
            }
        }
        int pares = 0;
        for (int i = 30; i <= 60; i++){
            pares += Math.min(be[i],bd[i]);
        }

        sc.close();
        System.out.println(pares);
    }
}