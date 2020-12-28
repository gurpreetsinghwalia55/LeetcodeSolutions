class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        if(nums.length == 1 && nums[0] == val) return 0;
        if(nums.length == 1 && nums[0] != val) return 1;
        
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
