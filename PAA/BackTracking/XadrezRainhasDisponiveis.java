public class XadrezRainhasDisponiveis {
    public static void main(String[] args) {
        int tamanhoQuadrado = 8;
        int alturaTabuleiro = tamanhoQuadrado;
        int larguraTabuleiro = tamanhoQuadrado;
        int matriz[][] = new int[alturaTabuleiro][larguraTabuleiro];
        posicionarRainhas(matriz, 4);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void posicionarRainhas(int[][] mat, int qntRainhas) {
        resolverProblema(mat, qntRainhas, 0, 0, 0);
    }

    public static boolean resolverProblema(int[][] mat, int qntRainhas, int qntRainhasColocadas, int col, int lin) {
        int linTotal = mat.length;
        int colTotal = mat[0].length;
        // Chegou no fim de tudo
        if (col == colTotal - 1 && lin == linTotal - 1) {
            return true;
        }
        // Preencheu as rainhas
        if (qntRainhas == qntRainhasColocadas) {
            return true;
        }

        // Se chegar na última coluna pula a linha
        if (col == colTotal - 1) {
            lin++;
            col = 0;
        }
        // 0 para rainha não colocada 1 para rainha colocada, pular a posição
        if (mat[lin][col] == 1) {
            return resolverProblema(mat, qntRainhas, qntRainhasColocadas, col + 1, lin);
        }
        // Loop
        for (int i = 0; i < colTotal; i++) {
            if (podeColocar(mat, qntRainhas, qntRainhasColocadas, col, lin)) {
                mat[lin][col] = 1;
                qntRainhasColocadas++;
                if (resolverProblema(mat, qntRainhas, qntRainhasColocadas, col + 1, lin)) {
                    imprimirTabuleiro(mat);
                    return true;
                }
                mat[lin][col] = 0;
            }
        }

        return false;

    }

    public static boolean podeColocar(int mat[][], int qntRainhas, int qntRainhasColocadas, int col, int lin) {
        // Testar todas as possibilidades
        // Nenhuma rainha foi colocada, então coloque-a na primeira casa
        if (qntRainhasColocadas == 0) {
            return true;
        }
        // Ver se tem uma rainha na linha
        for (int i = lin; i < mat.length; i++) {
            if (mat[i][col] == 1) {
                return false;
            }
        }
        // Ver coluna
        for (int i = 0; i < mat[lin].length; i++) {
            if (mat[col][i] == 1) {
                return false;
            }
        }

        // Ver diagonal principal
        // Achar primeira casa diagonal principal
        int dcol = col;
        int dlin = lin;
        while (dcol > 0 && dlin > 0) {
            dcol--;
            dlin--;
        }
        for (int i = dcol, j = dlin; i < mat.length - 1 && j < mat[0].length - 1; i++, j++) {
            if (mat[i][j] == 1) {
                return false;
            }
        }

        // Ver diagonal secundária
        dcol = col;
        dlin = lin;
        while (dcol > 0 && dlin >= 0) {
            dcol++;
            dlin++;
        }
        for (int i = dcol, j = dlin; i > 0 && j > 0; i--, j--) {
            if (mat[i][j] == 1) {
                return false;
            }
        }
        return true;

    }

    static void imprimirTabuleiro(int mat[][]) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
