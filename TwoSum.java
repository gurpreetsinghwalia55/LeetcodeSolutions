class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        
        //sorting the array so that the two pointer approach can be used
        Arrays.sort(nums);
        int start = 0; 
        int[] result;
        int end = nums.length - 1;
        // using two pointer to find the element
        while(start < end){
            int sum = (nums[start] + nums[end]);
            if(sum == target){
                result = new int[] {start, end};
                break;
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        
        // finding the element in the clone the indices have changed due to sorting first
        int a = 0;
        int b = 0;
        boolean found1 = false;
        boolean found2 = false;
        for(int i=0;i<copy.length;i++){
            if(found1 && found2) return new int[] {a,b};
            if(copy[i] == nums[start] && !found1) {
                a = i;
                found1 = true;
            }else if(copy[i] == nums[end] && !found2){
                b = i;
                found2 = true;
            }
        }
        if(found1 && found2) return new int[] {a,b};
        return null;
    }
}
