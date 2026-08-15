class Solution {
    public int longestOnes(int[] nums, int k) {
        int count = 0;
        int maxcount  = 0;
        int x = k;
        int right = 0;
        int left = 0;
        for(int i = 0; i<k; i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0){
                count++;
                x--;
            }
            maxcount  = count;
        }
        
        for(int i = k; i<nums.length;i++){
            if(nums[i] == 1){
                count++;
            }
            if(nums[i] == 0){
                count++;
                x--;
            }
            if(x<0){
                
                if(nums[left]==0){
                    x++;
                }
                left++;
                count--;

                

            }

        }
        return count;
    }
}