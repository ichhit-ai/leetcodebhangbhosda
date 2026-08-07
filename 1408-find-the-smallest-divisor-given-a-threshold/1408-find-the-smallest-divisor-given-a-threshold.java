class Solution {
    public long thresholding(int[] nums, int divisor) {
        long threshy = 0;

        for (int i = 0; i < nums.length; i++) {
             threshy += (nums[i] + divisor - 1) / divisor;
        }

        return threshy;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        long sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>sum){
                sum = nums[i];
            }
        }

        long low = 1;
        long high = sum;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (thresholding(nums, (int) mid) <= threshold) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) low;
    }
}