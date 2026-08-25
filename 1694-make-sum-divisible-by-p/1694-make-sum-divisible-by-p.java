class Solution {
    public int minSubarray(int[] nums, int p) {
        long[] prefix = new long[nums.length + 1];
        HashMap<Long, Integer> map = new HashMap<>();

        long sum = 0;

        for (int num : nums) {
            sum += num;
        }

        long remaining = sum % p;

        if (remaining == 0) {
            return 0;
        }

        int min = nums.length;
        map.put(0L, 0);

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = (prefix[i] + nums[i]) % p;

            long needed = (prefix[i + 1] - remaining + p) % p;

            if (map.containsKey(needed)) {
                min = Math.min(
                    min,
                    i + 1 - map.get(needed)
                );
            }

            map.put(prefix[i + 1], i + 1);
        }

        return min == nums.length ? -1 : min;
    }
}