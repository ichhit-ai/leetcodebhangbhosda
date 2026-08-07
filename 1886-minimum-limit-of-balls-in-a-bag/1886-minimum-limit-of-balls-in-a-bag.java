class Solution {

    public long maxops(int[] nums, int penalty) {
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = count + (nums[i] - 1) / penalty;
        }
        return count;
    }

    public int minimumSize(int[] nums, int maxOperations) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int low = 1;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (maxops(nums, mid) <= maxOperations) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}