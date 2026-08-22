class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int x : nums1) {
            set.add(x);
        }

        for (int x : nums2) {
            if (set.contains(x)) {
                arr.add(x);
                set.remove(x);
            }
        }

        return arr.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}