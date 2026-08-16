class Solution {
    public int totalFruit(int[] fruits) {
        if (fruits.length <= 2) {
            return fruits.length;
        }

        int left = 0;
        int max = 2;
        int x = fruits[0];
        int y = fruits[1];

        for (int right = 2; right < fruits.length; right++) {
            if (fruits[right] != x && fruits[right] != y) {
                x = fruits[right - 1];
                y = fruits[right];

                left = right - 1;

                while (left > 0 && fruits[left - 1] == x) {
                    left--;
                }
            }

            int count = right - left + 1;
            max = Math.max(max, count);
        }

        return max;
    }
}