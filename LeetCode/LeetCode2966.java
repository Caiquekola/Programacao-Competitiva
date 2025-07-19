import java.util.Arrays;
import java.util.Scanner;

public class LeetCode2966 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] nums = { 1, 3, 4, 8, 7, 9, 3, 5, 1 };
        int k = 2;
        int[][] vetor = Solution.divideArray(nums, k);
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j< 3;j++){
                System.out.print(vetor[i][j]);
            }
            System.out.println();
        }
    }

}

class Solution {
    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int tamanho = nums.length;
        int[][] vetor = new int[tamanho / 3][3];
        for (int i = 0; i < tamanho; i+=3) {
            if (Math.abs(nums[i] - nums[i + 1]) <= k&&Math.abs(nums[i] - nums[i + 2]) <= k) {
                vetor[i/3][0] = nums[i];
                vetor[(i/3)][1] = nums[i+1];
                vetor[(i/3)][2] = nums[i+2];

            }else{
                vetor = new int[0][];
                return vetor;
            }
        }
        return vetor;
    }
}