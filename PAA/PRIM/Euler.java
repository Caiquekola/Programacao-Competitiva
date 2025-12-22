public class Euler {
    public static void main(String[] args) {
        int[][] grafo = { { 1, 1, 1, 0, 0 },
                { 1, 0, 1, 1, 1 },
                { 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0 }
        };
        int qnt = 0;
        boolean ehEuler = true;
        for (int i = 0; i < grafo.length; i++) {
            qnt = 0;
            for (int j = 0; j < grafo[0].length; j++) {
                if(grafo[i][j]==1){
                    qnt++;
                }
            }
            if(qnt%2!=0){
                ehEuler=false;
                break;
            }
        }

        System.out.println(ehEuler?"É euler":"Não é Euler");
    }
}
