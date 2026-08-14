class Solution {
    public int maxVowels(String s, int k) {
        char[] vowel = {'a','e','i','o','u'};
        int vowelcount = 0;
        int maxvowel = 0;
        for(int i = 0; i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowelcount++;
                maxvowel = vowelcount;
            }

        }
        for(int i = k; i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                vowelcount++;
            }
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                vowelcount--;
            }
            if(maxvowel<vowelcount){
                maxvowel = vowelcount;
            }

        }
        return maxvowel;
        
    }
}