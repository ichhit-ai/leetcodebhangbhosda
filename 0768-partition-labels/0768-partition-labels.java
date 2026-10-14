
class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];

        // Store the last occurrence of every character
        for (int i = 0; i < s.length(); i++) {
            last[s.charAt(i) - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            right = Math.max(right, last[s.charAt(i) - 'a']);

            if (i == right) {
                ans.add(right - left + 1);
                left = i + 1;
            }
        }
        return ans;
    }
}