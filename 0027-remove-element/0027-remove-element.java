class Solution {
    public void swap(int[]arr,int i, int j){
       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int removeElement(int[] nums, int val) {
        int left = 0;
        
        for(int right = 0; right<nums.length;right++){
            if(nums[right]!=val){
                swap(nums,right,left);
                left++;

            }
            
        }
        return left;

        
    }
}