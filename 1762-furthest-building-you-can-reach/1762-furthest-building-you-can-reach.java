class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < heights.length - 1; i++) {
            int jump = heights[i + 1] - heights[i];
            if (jump <= 0) {
                continue;  
            }
            pq.offer(jump);
            if (pq.size() > ladders) {  //since ab ladder to khatam bhai jab tak hai tab tak ladder hi use kro jese khatam wese hi sabse chote walo ko bricks se chukao bhaisahab nice question
                bricks -= pq.poll();
            }
            if (bricks < 0) {
                return i;
            }
        }
        return heights.length - 1;
    }
}