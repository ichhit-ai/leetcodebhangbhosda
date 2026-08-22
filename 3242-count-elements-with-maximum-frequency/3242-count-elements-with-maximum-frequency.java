class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int count = 0;

        for (int x : nums) {
            int freq = map.getOrDefault(x, 0) + 1;
            map.put(x, freq);

            if (freq > max) {
                max = freq;
                count = freq;
            } else if (freq == max) {
                count += freq;
            }
        }

        return count;
    }
}