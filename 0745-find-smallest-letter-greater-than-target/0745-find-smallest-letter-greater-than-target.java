class Solution {
    
    public char nextGreatestLetter(char[] letters, char target) {
        
        char x = letters[0];
        int low = 0;
        int high = letters.length-1;
        int i = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(letters[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            i = low;
            
        }
        if(i==letters.length){
            return letters[0];
        }
        else{
            x = letters[i];
        }
        return x;






        
    }
}