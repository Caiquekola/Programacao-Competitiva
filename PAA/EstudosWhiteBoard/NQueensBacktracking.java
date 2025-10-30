
public import java.util.Arrays;

/**
 * Resolve o problema das N-Rainhas usando Backtracking.
 * Esta abordagem explora sistematicamente as possibilidades e
 * volta atrás (backtracks) quando um caminho leva a um beco sem saída.
 */
public class NQueensBacktracking {

    /**
     * Função principal que inicializa o tabuleiro e inicia o processo.
     */
    public void solve(int n) {
        // O tabuleiro é representado por um array onde 
        // o índice é a coluna (col) e o valor é a linha (row).
        // board[col] = row
        int[] board = new int[n];
        Arrays.fill(board, -1); // Inicializa com -1 (sem rainha)

        if (solveUtil(board, 0, n)) {
            System.out.println("Solução encontrada (Backtracking) para N = " + n + ":");
            printSolution(board);
        } else {
            System.out.println("Não foi encontrada solução (Backtracking) para N = " + n);
        }
    }

    /**
     * A função recursiva de backtracking.
     * Tenta colocar uma rainha na coluna 'col'.
     */
    private boolean solveUtil(int[] board, int col, int n) {
        // Caso Base: Se todas as rainhas foram colocadas (colunas 0 a n-1)
        if (col == n) {
            return true; // Sucesso!
        }

        // Tenta colocar uma rainha em cada linha (row) desta coluna (col)
        for (int row = 0; row < n; row++) {
            
            // 1. ESCOLHA: Tenta colocar a rainha em (row, col)
            // 2. VERIFICAÇÃO: Verifica se esta posição é segura
            if (isSafe(board, row, col)) {
                
                // Coloca a rainha
                board[col] = row; 

                // 3. EXPLORAÇÃO: Chama recursivamente para a próxima coluna
                if (solveUtil(board, col + 1, n)) {
                    return true; // Se a recursão foi bem-sucedida, propaga o sucesso
                }

                // 4. BACKTRACK: Se a exploração falhou (chegou a um beco sem saída)
                // Remove a rainha (desfaz a escolha) e tenta a próxima linha
                board[col] = -1; 
            }
        }

        // Se tentou todas as linhas desta coluna e nenhuma funcionou,
        // retorna false para acionar o backtrack na chamada anterior.
        return false;
    }

    /**
     * Verifica se é seguro colocar uma rainha em board[col] = row.
     * Como estamos preenchendo da esquerda para a direita (coluna por coluna),
     * só precisamos verificar as colunas à esquerda (de 0 até col-1).
     */
    private boolean isSafe(int[] board, int row, int col) {
        for (int prevCol = 0; prevCol < col; prevCol++) {
            int prevRow = board[prevCol];

            // 1. Verifica a mesma linha
            if (prevRow == row) {
                return false;
            }

            // 2. Verifica a diagonal
            // (row, col) e (prevRow, prevCol)
            // Se a diferença absoluta das linhas for igual à diferença absoluta das colunas,
            // elas estão na mesma diagonal.
            if (Math.abs(row - prevRow) == Math.abs(col - prevCol)) {
                return false;
            }
        }
        
        // Se passou por todas as rainhas anteriores e não houve conflito, é seguro.
        return true;
    }

    /**
     * Helper para imprimir o tabuleiro de forma visual.
     */
    private void printSolution(int[] board) {
        int n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[j] == i) { // Se board[coluna] == linha
                    System.out.print("Q ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }

    // Main para testar
    public static void main(String[] args) {
        NQueensBacktracking solver = new NQueensBacktracking();
        solver.solve(8); // Tenta resolver para N=8
    }
} {
    
}
