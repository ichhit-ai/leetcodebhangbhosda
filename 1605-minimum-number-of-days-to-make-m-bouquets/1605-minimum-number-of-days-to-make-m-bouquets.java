class Solution {
    public long bouquet(int[] arr, int days, int k) {
        int flowers = 0;
        long bouquets = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= days) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            }
            else {
                flowers = 0;
            }
        }

        return bouquets;
    }

    public int minDays(int[] bloomDay, int m, int k) {

        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int max = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > max) {
                max = bloomDay[i];
            }
        }

        int low = 0;
        int high = max;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (bouquet(bloomDay, mid, k) >= (long) m) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        return low;
    }
}