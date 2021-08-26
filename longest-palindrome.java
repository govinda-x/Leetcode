class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int c=0, flag =0, max=-1;
        char alpha = 'a';
        //putting the values with their counting in the hashmap
        for(int i=0; i<s.length(); i++){
            char ch  =  s.charAt(i);
            if(!h.containsKey(ch)) h.put(ch,1);
            else h.put(ch, h.get(ch)+1);
        }
        //iterating and adding the even occurences and also adding the max odd value to the c variable.
        for(Map.Entry<Character, Integer> e : h.entrySet()){
            if(e.getValue()%2==0) c+=e.getValue();
            else{
                if(max < e.getValue()){
                    max = e.getValue();
                    alpha = e.getKey();
                }  
            }
        }
        // now adding all the odd occurences reduced by 1 value to make it the longest palindrome.
        if(max>0){
            c+=max;
            for(Map.Entry<Character, Integer> e : h.entrySet()){
                if(e.getValue()%2!=0){
                    if(e.getKey() == alpha) continue;
                    c+= (e.getValue()/2)*2;
                }   
            }
        }
        
        return c;
    }
}