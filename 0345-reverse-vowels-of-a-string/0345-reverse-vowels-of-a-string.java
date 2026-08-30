class Solution {
    public String reverseVowels(String s) {
        char[] a = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (vowels.indexOf(a[left]) == -1) {
                left++;
            }
            else if (vowels.indexOf(a[right]) == -1) {
                right--;
            }
            else {
                char c = a[left];
                a[left] = a[right];
                a[right] = c;
                left++;
                right--;
            }
        }
        return new String(a);
    }
}
