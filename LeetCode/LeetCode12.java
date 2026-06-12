import java.util.ArrayList;

public class LeetCode12 {
    public static void main(String[] args) {
        System.out.println(new Solution().intToRoman(Integer.parseInt(args[0])));
    }

    static class Solution {
        public String intToRoman(int num) {
            
            String milhares[] = {"","M","MM","MMM"};
            String centenas[] = {"","C", "CC", "CCC","CD","D","DC","DCC","DCCC","CM"};
            String dezenas[] = {"","X", "XX", "XXX","XL","L","LX","LXX","LXXX","XC"};
            String unidades[] = {"","I", "II", "III","IV","V","VI","VII","VIII","IX "};

            return milhares[num/1000]+centenas[(num%1000)/100]+dezenas[(num%100)/10]+unidades[(num%10)];
        }

        class Mapa {
            int valor;
            char letra;

            public Mapa(int v, char l) {
                this.valor = v;
                this.letra = l;
            }

            @Override
            public String toString() {
                return "Mapa [valor=" + valor + ", letra=" + letra + "]";
            }

        }
    }
}
