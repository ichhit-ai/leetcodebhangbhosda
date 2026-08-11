class Solution {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void moveZeroes(int[] nums) {
        int left = 0;
        int right = 1;

        while (left < nums.length && right < nums.length) {

            if (left >= right) {
                right = left + 1;
            }

            if (left < nums.length && nums[left] != 0) {
                left++;
                continue;
            }

            if (right < nums.length && nums[right] == 0) {
                right++;
                continue;
            }

            if (left < nums.length && right < nums.length
                    && nums[left] == 0 && nums[right] != 0) {

                swap(nums, left, right);
                left++;
                right++;
            }
        }
    }
}