class Solution {
    public int rangesum(int[] prefix, int left, int right){
        int sum = 0;
        sum = prefix[right+1]- prefix[left];
        return sum;
    }
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length+1];
        for(int i = 0; i<nums.length;i++){
            prefix[i+1] = nums[i] + prefix[i];
        }
        
        for(int i = 0; i<nums.length; i++){
            int leftrangesum = rangesum(prefix,0,i-1);
            int rightrangesum = rangesum(prefix,i+1,nums.length-1);
            if(leftrangesum == rightrangesum){
                return i;
            }
        }
        return -1;
        
    }
}