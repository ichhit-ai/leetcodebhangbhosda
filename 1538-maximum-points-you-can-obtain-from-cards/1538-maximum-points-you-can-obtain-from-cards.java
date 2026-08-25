class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int remaining = cardPoints.length - k;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int notksum = 0;

        for (int i = 0; i < cardPoints.length; i++) {
            sum += cardPoints[i];

            if (i < remaining) {
                notksum += cardPoints[i];
            }
        }

        min = notksum;

        for (int i = remaining; i < cardPoints.length; i++) {
            notksum += cardPoints[i] - cardPoints[i - remaining];
            min = Math.min(min, notksum);
        }

        return sum - min;
    }
}