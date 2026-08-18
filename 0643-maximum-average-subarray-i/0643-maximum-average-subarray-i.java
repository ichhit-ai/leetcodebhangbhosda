class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double average = 0;
        double max = 0;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        average = (double) sum / k;
        max = average;

        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];

            average = (double) sum / k;

            if (average > max) {
                max = average;
            }
        }

        return max;
    }
}