class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 0;
        while(right<nums.length){
            if(nums[right]==0){
                right++;
                
            }
            if(right<nums.length && nums[right]!=0){
                swap(nums,left,right);
                left++;
                right++;
            }
            
        }

    
    }
}