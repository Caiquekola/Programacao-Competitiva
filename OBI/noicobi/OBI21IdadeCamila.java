package noicobi;
import java.util.Scanner;
public class OBI21IdadeCamila {

   
    public static void main(String[] args) {
        //Ci>Ca e Ce<Ca 
        Scanner scan = new Scanner(System.in);
        int quant = 3, camila=0;
        int N[] = new int[quant];
        
        for (int i = 0; i < 3; i++) {
            N[i] = scan.nextInt();
        }
        int i = 0, j = 1, aux;
        while(j<N.length){
            i = j-1;
            aux=N[j];
            while((i>=0)&&N[i]>aux){
                N[i+1] = N[i];
                i--;
            }
            N[i+1] = aux;
            j++;
        }
        //Camila
        System.out.println(N[1]);
    }
    
}
