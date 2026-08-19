class Solution {
    // same idea as your anagram(), just array-based instead of HashMap-based
    public boolean anagram(int[] countS, int[] countT) {
        for (int i = 0; i < 26; i++) {
            if (countS[i] != countT[i]) {
                return false;
            }
        }
        return true;
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> Anagramlist = new ArrayList<>();
        int n = strs.length;

        // precompute letter-count signature for every string ONCE
        int[][] counts = new int[n][26];
        for (int i = 0; i < n; i++) {
            for (char c : strs[i].toCharArray()) {
                counts[i][c - 'a']++;
            }
        }

        boolean[] visited = new boolean[n]; // replaces group.contains() scan

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }
            List<String> group = new ArrayList<>();
            for (int j = i; j < n; j++) {
                if (!visited[j] && anagram(counts[i], counts[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            Anagramlist.add(group);
        }
        return Anagramlist;
    }
}