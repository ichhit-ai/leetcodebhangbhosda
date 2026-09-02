class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == s.charAt(i)) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        char[] x = new char[stack.size()];
        for (int i = 0; i < x.length; i++) {
            x[i] = stack.pop();
        }
        //reverse logicccs
        int left = 0;
        int right = x.length - 1;
        while (left < right) {
            char temp = x[left];
            x[left] = x[right];
            x[right] = temp;

            left++;
            right--;
        }
        return new String(x);
    }
}
