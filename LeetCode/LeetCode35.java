public class LeetCode35 {
    public static void main(String[] args) {
        int values[] = {1,3,5,6};
        int target = ;
        System.out.println(Solution.searchInsert(values,target));
    }

    static class Solution {
        public static int searchInsert(int[] nums, int target) {
            return binarySearch(nums,target,0,nums.length-1);
        }

        public static int binarySearch(int[] nums, int target, int l, int r){
            int mid = ( l + r ) / 2;
            if(nums[mid]==target){
                return mid;
            }
            if(l>r){
                return l;
            }
            if(nums[mid]<target){
                l = mid + 1;
                return binarySearch(nums,target,l,r);
            }
            else{
                return binarySearch(nums,target,l,mid -1);
            }
        }

}
}

