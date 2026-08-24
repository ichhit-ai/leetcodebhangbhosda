class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int[] prefix = new int[nums.length + 1];

        map.put(0, -1);

        for (int i = 0; i < nums.length; i++) {

            prefix[i + 1] = prefix[i] + nums[i];

            int rem = prefix[i + 1] % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}