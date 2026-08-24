class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int balance = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                balance--;
            } else {
                balance++;
            }

            if (map.containsKey(balance)) {
                maxLength = Math.max(maxLength, i - map.get(balance));
            } else {
                map.put(balance, i);
            }
        }

        return maxLength;
    }
}