import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Leetcode1 {
    public static void main(String[] args) {
        int nums[] = {2,7,14,12};
        System.out.println(pos(9,nums));
    }
    /*
     * Dado um array retornar a posição dos dois elementos
     * cujo dê a soma alvo 
     * Ex: Alvo 9
     * 7,2 
     */
    public static String pos(int target, int nums[]){
        Map<Integer,Integer> mapa = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapa.put(nums[i], i);
            if(mapa.containsKey(target-nums[i])){
                return ("["+mapa.get(target-nums[i])+","+i+"]");
            }
        }
        return "";

    }
}
