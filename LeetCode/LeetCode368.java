import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode368 {
    public static void main(String[] args) {
        System.out.println(new Solution().lexicalOrder(3));
        System.out.println(new Solution().lexicalOrder(5));
        System.out.println(new Solution().lexicalOrder(12));

    }
}

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        list.sort((a,b)->{
            String s1 = String.valueOf(a);
            String s2 = String.valueOf(b);
            return s1.compareTo(s2);
        });
        return list;
    }
}