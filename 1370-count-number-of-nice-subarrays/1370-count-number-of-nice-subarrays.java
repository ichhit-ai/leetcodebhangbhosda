class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }

        int[] prefix = new int[nums.length + 1];
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            prefix[i+1] = prefix[i] + nums[i];

            if(map.containsKey(prefix[i+1] - k)){
                count += map.get(prefix[i+1] - k);
            }

            map.put(prefix[i+1], map.getOrDefault(prefix[i+1], 0) + 1);
        }

        return count;
    }
}