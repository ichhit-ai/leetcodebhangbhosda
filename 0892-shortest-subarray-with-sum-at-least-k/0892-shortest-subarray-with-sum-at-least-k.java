class Solution {
    public int shortestSubarray(int[] nums, int k) {
        long[] prefix = new long[nums.length + 1];
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, 0);

        int min = nums.length + 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];

            map.put(prefix[i + 1], i + 1);
        }
        long[] sorted = prefix.clone();
        Arrays.sort(sorted);
        int[] best = new int[sorted.length];
        for (int i = 0; i < sorted.length; i++) {
            best[i] = map.get(sorted[i]);
        }
        for (int i = 1; i < best.length; i++) {
            best[i] = Math.max(best[i], best[i - 1]);
        }
        for (int i = 0; i < nums.length; i++) {
            long limit = prefix[i + 1] - k;
            int left = 0;
            int right = sorted.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sorted[mid] <= limit) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            if (right >= 0) {
                int index = best[right];
                if (index <= i) {
                    min = Math.min(min, i + 1 - index);
                }
            }
        }
        if (min == nums.length + 1) {
            return -1;
        }
        else {
            return min;
        }
    }
}