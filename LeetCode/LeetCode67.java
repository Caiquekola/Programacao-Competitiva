public class LeetCode67{
    public static void main(String[] args) {
        var a = "11";
        var b = "1";
        System.out.println(new Solution().addBinary(a, b));
        a = "1010";
        b = "1011";
        System.out.println("\n"+new Solution().addBinary(a, b));

    }
}
class Solution {
    public String addBinary(String a, String b) {
        return Integer.toString((Integer.parseInt(a,2)+Integer.parseInt(b,2)),2);
    }
}