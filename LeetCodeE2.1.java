//https://leetcode.com/problems/first-bad-version/
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        while (left < right) {
            mid = left + (right-left)/2; 
            if(isBadVersion(left)) return left;
            else if(isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
