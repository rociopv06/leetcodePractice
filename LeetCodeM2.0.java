//https://leetcode.com/problems/search-in-rotated-sorted-array/solutions/5899673/simple-solution-with-diagrams-in-video-javascript-c-java-python/
class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return (nums[0] == target) ? 0 : -1;
        }
        int left = 0;
        int right = nums.length-1;
        int mid;
        while(left<=right) {
            mid = left + (right-left)/2; 
            if ( nums[mid]== target ) {
                return mid;
            }
            if(nums[left]<=nums[mid]) {
                if (target >=nums[left] && target<nums[mid]) {
                    right = mid - 1;
                }
                else {
                    left = mid + 1;
                }
            }
            if(nums[mid]<=nums[right]) {
                if (target <=nums[right] && target>nums[mid]) {
                    left = mid + 1;
                }
                else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
