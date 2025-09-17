public class LeetCode70 {
    public static void main(String[] args) {
        System.out.println(new Solution().climbStairs(5));
    }

    private static class Solution {
        public int climbStairs(int n) {
            if (n == 2) {
                return 2;
            }
            if (n == 3) {
                return 3;
            }
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }
}