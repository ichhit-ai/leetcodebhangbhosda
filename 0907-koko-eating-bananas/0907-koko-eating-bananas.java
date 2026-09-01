class Solution { 
    public long hours(int[] piles, long k) {
        long count = 0;

        for (int i = 0; i < piles.length; i++) {
            count += (piles[i] + k - 1) / k;
        }
        return count;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long sum = 0;
        for (int i = 0; i < piles.length; i++) {
            sum += piles[i];
        }
        long low = 1;
        long high = sum;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (hours(piles, mid) <= h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) low;
    }
}
