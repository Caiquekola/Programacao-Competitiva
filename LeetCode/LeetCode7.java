public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE-2);
        System.out.println(Solution.reverse(Integer.MAX_VALUE-3));
    }

    class Solution {
        public static int  reverse(int x) {
            String s = Integer.toString(Math.abs(x));
            StringBuilder resp = new StringBuilder(s);
            resp.reverse();
            try {
                int res = Integer.parseInt(resp.toString());
                if(x<0){
                    return res*-1;
                }else{
                    return res;
                }
            } catch (Exception e) {
                return 0;
            }
        }
    }
}
