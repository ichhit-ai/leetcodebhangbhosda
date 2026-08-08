class Solution {
    public long maxchild(int[] candles, int maxchoco) {
        long max = 0;

        for (int i = 0; i < candles.length; i++) {
            max = max + candles[i] / maxchoco;
        }

        return max;
    }

    public int maximumCandies(int[] candies, long k) {
        long all = 0;

        for (int i = 0; i < candies.length; i++) {
            all = all + candies[i];
        }

        if (all < k) {
            return 0;
        }

        int low = 1;
        int sum = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > sum) {
                sum = candies[i];
            }
        }

        int high = sum;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (maxchild(candies, mid) >= k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return high;
    }
}