class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //mei yaha pe map ko construct krungi string -> list of anagrams
        Map<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            //hm convert krenge ge string ko character array ke andr
            char[] chars = str.toCharArray();

            //sort krenge array ko
            Arrays.sort(chars);
            //convert the sorted characters back to string 
            String key = new String(chars);

            //agar hmare key present nahi hai  create a new list
            map.putIfAbsent(key, new ArrayList<>());

            map.get(key).add(str);
        }
        //return aLL Groups
        return new ArrayList<>(map.values());
    }
}