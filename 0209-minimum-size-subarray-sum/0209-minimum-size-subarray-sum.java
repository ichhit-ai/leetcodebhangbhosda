class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int count = 0;
        int rep = 0;
        int shortrep = 0;

        while (right < nums.length) {

            count = count + nums[right];
            right++;
            rep++;

            while (count >= target) {

                if (shortrep == 0 || rep < shortrep) {
                    shortrep = rep;
                }

                count = count - nums[left];
                left++;
                rep--;
            }
        }

        return shortrep;
    }
}