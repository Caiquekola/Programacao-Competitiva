import java.util.Scanner;

public class N1Fatorial {
    public static void main(String[] args) {
        int[] fatoriais = new int[10];
        fatoriais[0] = 1;
        Scanner scan = new Scanner(System.in);
        for (int index = 1; index < 10; index++) {
            fatoriais[index] = index * fatoriais[index-1]; 
        }

        for (int i : fatoriais) {
            System.out.println(i);
        }

        int n = scan.nextInt(); 
        for (int i = 1; i < fatoriais.length; i++) {
            if(fatoriais[i]==n){
                System.out.println(fatoriais[i]);
            }
        }


    }
}
