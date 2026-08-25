class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int count = 0;
        int[] prefix = new int[nums.length + 1];

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
            int rem = ((prefix[i + 1] % k) + k) % k;
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}