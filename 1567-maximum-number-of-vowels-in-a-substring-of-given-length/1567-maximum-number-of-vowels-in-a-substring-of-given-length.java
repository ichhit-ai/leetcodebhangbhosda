class Solution {
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int vowelcount = 0;
        int maxvowel = 0;

        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelcount++;
            }
        }

        maxvowel = vowelcount;

        for (int i = k; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                vowelcount++;
            }

            if (isVowel(s.charAt(i - k))) {
                vowelcount--;
            }

            maxvowel = Math.max(maxvowel, vowelcount);
        }

        return maxvowel;
    }
}