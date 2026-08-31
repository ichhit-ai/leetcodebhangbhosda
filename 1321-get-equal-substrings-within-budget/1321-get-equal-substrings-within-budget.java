class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int cost = 0;
        int totalcost = 0;
        int left = 0;
        int right = 0;
        int max= 0;
        int finalmax = 0;
        while(right<s.length()){
            cost  = Math.abs((int) s.charAt(right) - t.charAt(right));
            totalcost = cost + totalcost;
            right++;
            if(totalcost<=maxCost){
                max = right-left;
            }
            if(totalcost>maxCost){
                totalcost = totalcost - Math.abs((int) s.charAt(left) - t.charAt(left));
                left++;
                
            }
            finalmax = Math.max(max,finalmax);
        }
        return finalmax;
    }
}