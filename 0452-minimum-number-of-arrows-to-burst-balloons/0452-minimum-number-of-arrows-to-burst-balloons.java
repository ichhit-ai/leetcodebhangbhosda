class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a,b)-> Integer.compare(a[1], b[1]));  //sorting with comparator bhaisahab as perend value
        if(points.length==0){ 
            return 0;
        }
        int arrows = 1;
        int end = points[0][1];          //we need to pop one balloon at first since we are just starting kinda as well
        for(int i = 1; i<points.length;i++){
            if(points[i][0]> end){         //only when the end is less than next starting 
                arrows++;                                 //since its sorted so we only need to know about one condition
                end = points[i][1];

            }
        }
        return arrows;
    }
}