class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // build a signature: count of each letter, encoded as a string
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            // turn the count array into a unique key, e.g. "1#0#0#2#0..." 
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]).append('#');
            }
            String key = sb.toString();

            // group strings under the same signature
            map.computeIfAbsent(key, x -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
}