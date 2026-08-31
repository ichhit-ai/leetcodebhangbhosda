class Solution {
    public int longestSubarray(int[] nums) {
        int count = 0;
        int left = 0;
        int right = 0;
        int maxcount = 0;
        int zerocount = 1;
        int lastzero = -1;

        while (right < nums.length) {
            if (nums[right] == 1) {
                count++;
                right++;
            } 
            else if (zerocount == 1) {
                lastzero = right;
                right++;
                zerocount--;
            } 
            else if(zerocount == 0) {
                left = lastzero + 1;
                zerocount++;
                count = right - left;
            }
            if(count == nums.length){
                count = nums.length -1;
            }
            

            maxcount = Math.max(maxcount, count);
        }

        return maxcount;
    }
}
