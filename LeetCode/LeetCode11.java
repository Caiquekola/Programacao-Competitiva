public class LeetCode11 {
    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        System.out.println(Solution.maxArea(height));
    }
}

class Solution {
    public static int maxArea(int[] height) {
        int melhorContador = 0;
        int idxA = 0, dist = 1;
        for (int idx = 1; idx < height.length; idx++) {
            idxA = height[idx-1];
            dist = 1;
            
        }
    }
}
