class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) ->
            Integer.compare(b[1], a[1])
        );

        int units = 0;

        for (int i = 0; i < boxTypes.length; i++) {

            int boxes = Math.min(boxTypes[i][0], truckSize); //handling edgecase here that is if there are more than trucksize kinda 
            units += boxes * boxTypes[i][1];
            truckSize -= boxes;
            if (truckSize == 0) {
                break;
            }
        }
        return units;
    }
}