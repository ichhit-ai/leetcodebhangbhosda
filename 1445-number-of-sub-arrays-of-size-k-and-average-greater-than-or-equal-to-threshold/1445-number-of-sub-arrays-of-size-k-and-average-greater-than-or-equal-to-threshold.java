class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        double average =0;
        int count = 0;

        //first window
        for(int i = 0; i<k;i++){
            sum = sum + arr[i];
        }
        average = sum/k;
        if(average>=threshold){
            count++;
        }
        //slide window
        for(int i = k;i<arr.length;i++){
            sum = sum + arr[i] - arr[i-k];
            average = sum/k;
            if(average>=threshold){
                count++;
            }

        }
        return count;

        
        
    }
}