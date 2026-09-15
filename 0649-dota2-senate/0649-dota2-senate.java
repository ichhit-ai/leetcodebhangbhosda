class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Deque<Integer> r = new ArrayDeque<>();
        Deque<Integer> d = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R') {
                r.offerLast(i);
            } else {
                d.offerLast(i);
            }
        }
        
        while (!d.isEmpty() && !r.isEmpty()) {
            int rIndex = r.pollFirst();
            int dIndex = d.pollFirst();
            if (rIndex < dIndex) {
                r.offerLast(rIndex + n);
            } else {
                d.offerLast(dIndex + n);
            }
        }
        
        if (d.isEmpty()) {
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}