class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        for(int i = nums.length-1; i>=0;i--){
            if(set.contains(nums[i]- 2*nums[i])){
                if(max<nums[i]){
                    max = nums[i];
                }
            }
            
        }
        if(max>0){
            return max;
        }
        else{
        return -1;
        }
    }
}