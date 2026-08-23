class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        Arrays.sort(nums);

        for (int x : nums) {
            set.add(x);
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (set.contains(-nums[i])) {
                return nums[i];
            }
        }

        return -1;
    }
}