class Solution {
    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            // We want an even index
            if (mid % 2 == 1) {
                mid--;
            }
            // Pair is still normal
            if (nums[mid] == nums[mid + 1]) {
                low = mid + 2;
            }
            // pair is broken
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}
