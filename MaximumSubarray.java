class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int globalSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(nums[i], currSum + nums[i]);
            globalSum = Math.max(globalSum, currSum);
        }
        return globalSum;
    }
}
