class RecentCounter {
    Deque<Integer> queue;
    public RecentCounter() {
        queue=new ArrayDeque<>();
    }
    public int ping(int t) {
        queue.offerLast(t);
        int left=t-3000;
        int right=t;
        while(!queue.isEmpty() && (queue.peekFirst()<left || queue.peekFirst()>right)){
            queue.pollFirst();
        }
        return queue.size();
    }
}
