class Solution {
    public long pickGifts(int[] gifts, int k) {

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int gift : gifts) {
            pq.offer(gift);
        }
        for (int i = 0; i < k; i++) {

            int biggest = pq.poll();

            int newValue = (int) Math.sqrt(biggest);
            pq.offer(newValue);
        }
        long answer = 0;
        while (!pq.isEmpty()) {
            answer += pq.poll();
        }
        return answer;
    }
}
