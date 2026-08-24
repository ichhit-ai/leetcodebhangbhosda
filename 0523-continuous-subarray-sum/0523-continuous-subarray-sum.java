class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int[] prefix = new int[nums.length + 1];

        for(int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        Map<Integer, Integer> m = new HashMap<>();

        for(int i = 0; i < prefix.length; i++) {
            int reminder = prefix[i] % k;
            if (m.containsKey(reminder)) {
                if (i - m.get(reminder) >= 2) {
                    return true;
                }
            } else {
                m.put(prefix[i] % k, i);
            }
        }

        return false;
    }
}
/*
23 2 4 6 7
0 23 25 29 35 42

sum(i, j) = prefix[j + 1] - prefix[i];
(prefix[j + 1] - prefix[i]) % k == 0;
                 <--->
prefix[j + 1] % k == prefix[i] % k*/

