import java.util.PriorityQueue;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (x, y) -> Integer.compare(y[0], x[0])
        );
        if (a > 0) pq.offer(new int[]{a, 'a'});
        if (b > 0) pq.offer(new int[]{b, 'b'});
        if (c > 0) pq.offer(new int[]{c, 'c'});
        StringBuilder sb = new StringBuilder();

        while (!pq.isEmpty()) {
            int[] first = pq.poll();

            int n = sb.length();

            // Would adding this character create three consecutive copies?
            if (n >= 2 &&
                sb.charAt(n - 1) == (char) first[1] &&
                sb.charAt(n - 2) == (char) first[1]) {

                // No alternative character is available
                if (pq.isEmpty()) {
                    break;
                }

                // Use the second most frequent character
                int[] second = pq.poll();

                sb.append((char) second[1]);
                second[0]--;

                if (second[0] > 0) {
                    pq.offer(second);
                }
                // The first character was not used, so put it back
                pq.offer(first);

            } else {
                sb.append((char) first[1]);
                first[0]--;

                if (first[0] > 0) {
                    pq.offer(first);
                }
            }
        }
        return sb.toString();
    }
}