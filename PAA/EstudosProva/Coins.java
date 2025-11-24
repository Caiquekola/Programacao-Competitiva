public class Coins {
    public static void main(String[] args) {
        int centavos = 89;
        int moedas[] = {1,5,10,25,50};
        for (int i = 0; i < moedas.length; i++) {
            int indmoeda = moedas.length-i-1;
            if(centavos>moedas[indmoeda]){
                System.out.println(centavos/moedas[indmoeda] +" moeda(s) de R$0,"+moedas[indmoeda]);
                centavos = centavos%moedas[indmoeda];
            }
        }
    }
}
