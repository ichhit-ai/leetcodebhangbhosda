class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                long sum = (long) nums[i] + nums[j] + nums[k];
                long diff = Math.abs((long) target - sum);
                if (diff < minDiff) {
                    minDiff = (int) diff;
                    result = (int) sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    return target;
                }
            }
        }
        return result;
    }
}
