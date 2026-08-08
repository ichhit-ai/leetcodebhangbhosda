class Solution {
    public long maxsplitnum(int[] nums, int maxnum) {
    long sum = 0;
    int count = 1;

    for (int i = 0; i < nums.length; i++) {

        if (sum + nums[i] <= maxnum) {
            sum += nums[i];
        }
        else {
            count++;
            sum = nums[i];
        }
    }

    return count;
}
    public int splitArray(int[] nums, int k) {

    int low = 0;
    int maxsum = 0;

    for (int i = 0; i < nums.length; i++) {
        maxsum = maxsum + nums[i];

        if (nums[i] > low) {
            low = nums[i];
        }
    }

    int high = maxsum;

    while (low <= high) {

        int mid = low + (high - low) / 2;

        if (maxsplitnum(nums, mid) <= k) {
            high = mid - 1;
        }
        else {
            low = mid + 1;
        }
    }

    return low;
}
}