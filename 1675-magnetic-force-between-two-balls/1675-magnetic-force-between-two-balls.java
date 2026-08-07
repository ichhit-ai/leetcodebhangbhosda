class Solution {

    public long minballs(int[] nums, int distance) {
        int balls = 1;
        int comparedelement = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (Math.abs(comparedelement - nums[i]) >= distance) {
                balls++;
                comparedelement = nums[i];
            }

        }

        return balls;
    }


    public int maxDistance(int[] nums, int m) {

        Arrays.sort(nums);

        int low = 1;
        int high = nums[nums.length - 1] - nums[0];

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (minballs(nums, mid) >= m) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

        }

        return high;
    }
}