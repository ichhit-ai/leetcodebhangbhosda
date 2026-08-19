class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = true;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length;i++){
            set.add(nums[i]);
        }
        if(nums.length == set.size()){
            duplicate = false;

        }
        else{
            duplicate = true;
        }
        return duplicate;
        
    }
}