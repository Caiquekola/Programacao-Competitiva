import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        System.out.println("Iniciar jogo");
        System.out.println("Escolha: PEDRA(1), PAPEL(2), TESOURA(3)");

        int n = 1; // jogada do jogador
        int numGerado = new Random().nextInt(3) + 1; // gera 1, 2 ou 3

        Mao jogador = Mao.fromNum(n);
        Mao oponente = Mao.fromNum(numGerado);

        System.out.println("Jogador: " + jogador);
        System.out.println("Oponente: " + oponente);
        System.out.println("Jogador vence? " + jogador.venceDe(oponente));
    }

    enum Mao {
        PEDRA(1), PAPEL(2), TESOURA(3);

        private final int num;
        private Mao venceDe;

        static {
            PEDRA.venceDe = TESOURA;
            PAPEL.venceDe = PEDRA;
            TESOURA.venceDe = PAPEL;
        }

        Mao(int n) {
            this.num = n;
        }

        public int getNum() {
            return num;
        }

        public boolean venceDe(Mao outraMao) {
            return this.venceDe == outraMao;
        }

        public static Mao fromNum(int n) {
            for (Mao m : Mao.values()) {
                if (m.getNum() == n) {
                    return m;
                }
            }
            throw new IllegalArgumentException("Número inválido: " + n);
        }
    }
}