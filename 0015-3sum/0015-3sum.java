class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> finalist = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate values for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {

                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {

                    finalist.add(Arrays.asList(
                        nums[i],
                        nums[j],
                        nums[k]
                    ));

                    // Skip duplicate j values
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate k values
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    j++;
                    k--;

                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return finalist;
    }
}
