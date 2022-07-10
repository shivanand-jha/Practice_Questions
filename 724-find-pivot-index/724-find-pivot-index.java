class Solution {
    public int pivotIndex(int[] nums) {
        int n = 0, m = 0;
        for (int x: nums) n += x;
        for (int i = 0; i < nums.length; ++i) {
            if (m == n - m - nums[i]) return i;
            m += nums[i];
        }
        return -1;
    }
}