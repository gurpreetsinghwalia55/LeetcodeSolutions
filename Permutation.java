class Solution {
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void util(int[]nums, int l, int r,List<List<Integer>> results){
        if(l == r-1){
            List<Integer> result = new ArrayList<Integer>();
            for(int value : nums){
                result.add(value);
            }
            results.add(result);
            return;
        }
        for(int i=l;i<r;i++){
            swap(nums, l, i);
            util(nums, l+1, r, results);
            swap(nums, l, i);
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        util(nums, 0, nums.length, results);
        return results;
    }
}
