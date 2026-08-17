class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int multiple = 0;
        int right = 0;

        if (k <= 1) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            multiple = nums[i];
            right = i + 1;

            if (multiple < k) {
                count++;
            }
            while (right <= nums.length - 1 && multiple < k) {
                multiple = multiple * nums[right];

                if (multiple < k) {
                    count++;
                    right++;
                }
            }
        }
        return count;
    }
}