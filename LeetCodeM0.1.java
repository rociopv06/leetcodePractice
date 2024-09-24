//209. Minimum Size Subarray Sum
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length==0) return(0);
        int left = 0;
        int sum = 0;
        int subMin = Integer.MAX_VALUE;
        for(int right = 0; right<nums.length ;++right) {
            sum +=nums[right];
            while(sum >= target) {
                subMin = Math.min(subMin,(right-left)+1);
                sum -= nums[left];
                ++left;
            }
        }
        return(subMin) == Integer.MAX_VALUE ? 0 : subMin;
    }
}
