import java.util.Scanner;

public class problemB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        String topAndBottom = "+------------------------+";
        String firstLine = "|#.#.#.#.#.#.#.#.#.#.#.|D|)";
        String secondLine = "|#.#.#.#.#.#.#.#.#.#.#.|.|";
        String thirdLine = "|#.......................|";
        String fourthLine = "|#.#.#.#.#.#.#.#.#.#.#.|.|)";
        char f1chars[] = firstLine.toCharArray();
        char f2chars[] = secondLine.toCharArray();
        char f3chars[] = thirdLine.toCharArray();
        char f4chars[] = fourthLine.toCharArray();
        int qntF1 = 0;
        int qntF2 = 0;
        int qntF3 = 0;
        int qntF4 = 0;
        if(k>4){
            qntF4 = (k - 1) / 3;
            qntF2 = (k) / 3;
            qntF3 = 1;
            qntF1 = (k + 1)/3;
        }else{
            qntF1 = k>=1?1:0;
            qntF2 = k>=2?1:0;
            qntF3 = k>=3?1:0;
            qntF4 = k>=4?1:0;
        }
        System.out.println(topAndBottom);
        StringBuilder sb = new StringBuilder();
        int qntSubs = 0;
        int tamanho = f1chars.length;
        for(int i = 0; i < tamanho; i++){
            if(f1chars[i]=='#'&qntSubs<qntF1){
                f1chars[i]='O';
                qntSubs++;
            }
            sb.append(f1chars[i]);
        }
        System.out.println(sb.toString());
        tamanho = f2chars.length;
        sb = new StringBuilder();
        qntSubs = 0;
        for(int i = 0; i < tamanho; i++){
            if(f2chars[i]=='#'&qntSubs<qntF2){
                f2chars[i]='O';
                qntSubs++;
            }
            sb.append(f2chars[i]);
        }
        System.out.println(sb.toString());
        tamanho = f3chars.length;
        sb = new StringBuilder();
        qntSubs = 0;
        for(int i = 0; i < tamanho; i++){
            if(f3chars[i]=='#'&qntSubs<qntF3){
                f3chars[i]='O';
                qntSubs++;
            }
            sb.append(f3chars[i]);
        }
        System.out.println(sb.toString());
        tamanho = f4chars.length;
        sb = new StringBuilder();
        qntSubs = 0;
        for(int i = 0; i < tamanho; i++){
            if(f4chars[i]=='#'&qntSubs<qntF4){
                f4chars[i]='O';
                qntSubs++;
            }
            sb.append(f4chars[i]);
        }
        System.out.println(sb.toString());
        System.out.println(topAndBottom);
    }
}
