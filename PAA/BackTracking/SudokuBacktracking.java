public class SudokuBacktracking {

    // Tamanho do tabuleiro padrão de Sudoku
    public static final int TAMANHO = 9;

    public static void main(String[] args) {
        // 0 representa célula vazia
        int[][] tabuleiro = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},

            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},

            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        System.out.println("Sudoku inicial:");
        imprimirTabuleiro(tabuleiro);

        if (resolverSudoku(tabuleiro)) {
            System.out.println("\nSudoku resolvido:");
            imprimirTabuleiro(tabuleiro);
        } else {
            System.out.println("Não existe solução para este Sudoku.");
        }
    }

    // Função principal de backtracking
    public static boolean resolverSudoku(int[][] tabuleiro) {
        int[] posicaoVazia = encontrarPosicaoVazia(tabuleiro);

        // Se não há posição vazia, o Sudoku está resolvido
        if (posicaoVazia == null) {
            return true;
        }

        int linha = posicaoVazia[0];
        int coluna = posicaoVazia[1];

        // Tenta números de 1 a 9
        for (int numero = 1; numero <= 9; numero++) {
            if (ehSeguro(tabuleiro, linha, coluna, numero)) {
                tabuleiro[linha][coluna] = numero; // faz a escolha

                // Chama recursivamente para resolver o resto do tabuleiro
                if (resolverSudoku(tabuleiro)) {
                    return true;
                }

                // Se não deu certo, desfaz a escolha (backtracking)
                tabuleiro[linha][coluna] = 0;
            }
        }

        // Se nenhum número servir, volta (trigger do backtracking)
        return false;
    }

    // Encontra a próxima célula vazia (0). Retorna {linha, coluna} ou null se não houver.
    public static int[] encontrarPosicaoVazia(int[][] tabuleiro) {
        for (int linha = 0; linha < TAMANHO; linha++) {
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                if (tabuleiro[linha][coluna] == 0) {
                    return new int[]{linha, coluna};
                }
            }
        }
        return null; // não há células vazias
    }

    // Verifica se é seguro colocar "numero" em (linha, coluna)
    public static boolean ehSeguro(int[][] tabuleiro, int linha, int coluna, int numero) {
        // Verifica linha
        for (int c = 0; c < TAMANHO; c++) {
            if (tabuleiro[linha][c] == numero) {
                return false;
            }
        }

        // Verifica coluna
        for (int l = 0; l < TAMANHO; l++) {
            if (tabuleiro[l][coluna] == numero) {
                return false;
            }
        }

        // Verifica bloco 3x3
        int inicioBlocoLinha = (linha / 3) * 3;
        int inicioBlocoColuna = (coluna / 3) * 3;

        for (int l = inicioBlocoLinha; l < inicioBlocoLinha + 3; l++) {
            for (int c = inicioBlocoColuna; c < inicioBlocoColuna + 3; c++) {
                if (tabuleiro[l][c] == numero) {
                    return false;
                }
            }
        }

        return true; // se passou por todas verificações, é seguro
    }

    // Imprime o tabuleiro de forma bonitinha
    public static void imprimirTabuleiro(int[][] tabuleiro) {
        for (int linha = 0; linha < TAMANHO; linha++) {
            if (linha % 3 == 0 && linha != 0) {
                System.out.println("------+-------+------");
            }
            for (int coluna = 0; coluna < TAMANHO; coluna++) {
                if (coluna % 3 == 0 && coluna != 0) {
                    System.out.print("| ");
                }
                System.out.print(tabuleiro[linha][coluna] + " ");
            }
            System.out.println();
        }
    }
}
