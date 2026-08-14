class Solution {
    public int maxVowels(String s, int k) {
        
        int vowelcount = 0;
        int maxvowel = 0;
        for(int i = 0; i<k;i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                vowelcount++;
               
            }
             maxvowel = vowelcount;

        }
        for(int i = k; i<s.length();i++){
            if("aeiou".indexOf(s.charAt(i)) != -1){
                vowelcount++;
            }
            
            if("aeiou".indexOf(s.charAt(i-k)) != -1){
                vowelcount--;
            }
            if(maxvowel<vowelcount){
                maxvowel = vowelcount;
            }

        }
        return maxvowel;
        
    }
}