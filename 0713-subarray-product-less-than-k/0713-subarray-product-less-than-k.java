class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int multiple = 1;
        int left = 0;
        int right = 0;

        if (k <= 1) {
            return 0;
        }

        while (right < nums.length) {
            multiple = multiple * nums[right];

            while (multiple >= k) {
                multiple = multiple / nums[left];
                left++;
            }

            count = count + right - left + 1;
            right++;
        }

        return count;
    }
}