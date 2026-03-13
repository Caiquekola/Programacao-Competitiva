import java.util.Scanner;

public class Exc3{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int x =0,y=0, cont=0;
        for (int i = 0; i < N; i++) {
            cont = 0;
            x = scan.nextInt();
            y = scan.nextInt();
            while(x%y!=0){
                cont++;
                x++;
            }
            System.out.println(cont);
        }
    }
}