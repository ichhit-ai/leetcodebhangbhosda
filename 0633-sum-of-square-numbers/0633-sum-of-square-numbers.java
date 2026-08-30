class Solution {
    public boolean judgeSquareSum(int c) {
        long sq = (long) Math.sqrt(c);
        long left = 0;
        long right = sq;
        if(c==0){
            return true;
        }
        while(left<=right){
            if(left*left + right *right == c){
                return true;
            }
            else if(left*left + right *right >c){
                right--;
            }
            else{
                left++;
            }
        }
        return false;
    }
}