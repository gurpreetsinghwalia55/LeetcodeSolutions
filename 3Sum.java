class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0;i<nums.length-2;i++){
            if((i == 0 || (i > 0 && nums[i] != nums[i-1]))){
                int start = i+1;
                int end = nums.length-1;
                int sum = 0 - nums[i];
                while(start < end){
                    if(sum == nums[start] + nums[end]){
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[start]);
                        temp.add(nums[end]);
                        result.add(temp);
                        while(start < end && (nums[start] == nums[start+1])) start++;
                        while(start < end && (nums[end] == nums[end-1])) end--;
                        start++;
                        end--;
                    }else if(nums[start] + nums[end] > sum){
                        end--;
                    }else{
                        start++;
                    }
                }
            }
        }
        return result;
    }
}
