class Solution {
    public int[] runningSum(int[] nums) {
        
        for(int i=1; i<nums.length; i++)
        {
            int sum=0;
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}