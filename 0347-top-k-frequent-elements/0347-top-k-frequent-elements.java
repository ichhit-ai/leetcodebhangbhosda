class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int maxcount = 0;
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());  //converting to list so as can be sorted later
        
        list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));   //sorting list in descening manner chutiyapa
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}