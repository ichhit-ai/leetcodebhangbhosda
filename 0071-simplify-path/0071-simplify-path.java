class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        String[] parts = path.split("/");

        for (int i = 0; i < parts.length; i++) {

            if (parts[i].equals("")) {
                continue;
            }
            else if (parts[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (parts[i].equals(".")) {
                continue;
            }
            else {
                stack.push(parts[i]);
            }
        }

        String[] result = new String[stack.size()];
        int x = 0;

        while (!stack.isEmpty()) {
            result[x] = stack.pop();
            x++;
        }
        int left = 0;
        int right = result.length - 1;
        while (left < right) {
            String temp = result[left];
            result[left] = result[right];
            result[right] = temp;

            left++;
            right--;
        }
        return "/" + String.join("/", result);
    }
}
