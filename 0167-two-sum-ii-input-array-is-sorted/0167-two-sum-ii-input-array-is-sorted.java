class Solution {
    public int[] twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while(low<high){
            if(nums[low]+nums[high] == target){
                return new int[]{low+1,high+1};
            }
            else if(nums[low] + nums[high] > target){
                high--;
            }
            else{
                low++;
            }
        }
        return new int[]{-1};

        
    }
    
}