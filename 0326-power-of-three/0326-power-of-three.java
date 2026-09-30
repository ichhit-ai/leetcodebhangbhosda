class Solution {
    public boolean isPowerOfThree(int n) {
          if(n == 1){
            return true;              //base case that is divided so much that now we are onto this  that n became 1 so everything is divisble by 3 ya ya 
        }
        if(n<=0 || n%3!=0){
            return false;          //base case where like  if it isnt divisible by 3 then how can it be a power of 3 so yeah yeah
        }
        return isPowerOfThree(n/3);  //recursion

    }
}