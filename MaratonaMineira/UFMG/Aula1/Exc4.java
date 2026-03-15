import java.util.Scanner;
public class Exc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a=0,b=0,x=0,y=0;
        for (int i = 0; i < N; i++) {
            a = scan.nextInt();
            b = scan.nextInt();
            x = scan.nextInt();x++;
            y = scan.nextInt();y++;

            if(x>(a/2)){
                x= a - x + 1;
            }
            if(y>(b/2)){
                y = b - y + 1;
            }
            int downSum = (a-x) * (b);
            int rightSum = (b-y) * (a);
            if(downSum>=rightSum){
                System.out.println(downSum);
            }else{
                System.out.println(rightSum);
            }


        }
    }
}
