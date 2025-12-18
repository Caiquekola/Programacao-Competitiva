public class ColorirGrafo {
    public static void main(String[] args) {
        int[][] grafo = {
                { 0, 1, 0, 0, 0 },
                { 1, 0, 1, 0, 0 },
                { 0, 1, 0, 1, 0 },
                { 0, 0, 1, 0, 1 },
                { 0, 0, 0, 1, 0 }
        };
        int cores[] = colorirGrafo(grafo);
        for (int i : cores) {
            System.out.print(i + " ");
        }
    }

    public static int[] colorirGrafo(int[][] grafo) {
        int cores[] = new int[grafo.length];
        int cor = 1;
        for (int v = 0; v < grafo.length; v++) {
            for (int i = 0; i < grafo.length; i++) {
                if (grafo[v][i] == 0 && cores[i] == 0 && verificaHaVizinhoCor(grafo,cores, i, cor)) {
                    cores[i] = cor;
                }
            }
            cor++;
        }

        return cores;
    }

    // Não ter ligação
    public static boolean verificaHaVizinhoCor(int[][] grafo,int[]cores, int i, int cor) {
        for (int j = 0; j < grafo.length; j++) {
            if (cores[j] == cor && grafo[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
