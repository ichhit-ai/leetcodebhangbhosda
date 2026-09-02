class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque<Character> stacks = new ArrayDeque<>();
        Deque<Character> stackt = new ArrayDeque<>();
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='#'){
                if(!stacks.isEmpty()){
                stacks.pop();
                }
            }
            else{stacks.push(s.charAt(i));
            }
        }
        for(int i = 0; i<t.length();i++){
            if(t.charAt(i)=='#'){
                if(!stackt.isEmpty()){
                stackt.pop();
                }
            }
            else{stackt.push(t.charAt(i));
            }
        }
        if(stacks.size()!=stackt.size()){
            return false;
        }
        while (!stacks.isEmpty()) {
            if (stacks.pop() != stackt.pop()) {
                return false;
             }  
        }
        return true;

        
    }
}