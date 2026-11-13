
import java.util.Arrays;

public class LeetCode16 {
    public static void main(String[] args) {
        int nums[] = {-1,2,1,-4};
        System.out.println(threeSumClosest(nums,1));
        
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length-2; i++) {
            int j = i +1;
            int k = nums.length-1;
            int sum = nums[i]+nums[j]+nums[k];
            if(sum<closest){
                closest = sum;
            }
        }

        return 0;
    }

} 