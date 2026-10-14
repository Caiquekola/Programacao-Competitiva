import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode15 {
    public static void main(String[] args) {
        int[] array = { -1, 0, 1, 2, -1, -4 };
        threeSum(array);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> complemento = new TreeSet<>();
        for (int n : nums) {
            complemento.add(n);
        }
        List<List<Integer>> resposta =  new ArrayList<ArrayList<Integer>>();
        List<Integer> rAtual;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums[nums.length-1];
            int valorSoma = nums[i] + nums[j] + nums[k];
            if(valorSoma=0){
                rAtual = List.of(nums[i],nums[j],nums[k]);
            }
        }
        System.out.println(complemento);
        return new ArrayList<List<Integer>>();
    }

    /*
     * Given an integer array nums, return all the triplets [nums[i], nums[j],
     * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
     * nums[k] == 0.
     * 
     * Notice that the solution set must not contain duplicate triplets.
     * 
     * 
     * 
     * Example 1:
     * 
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not
     * matter.
     * Example 2:
     * 
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     * Example 3:
     * 
     * Input: nums = [0,0,0]
     * Output: [[0,0,0]]
     * Explanation: The only possible triplet sums up to 0.
     */

}