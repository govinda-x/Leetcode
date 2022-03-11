class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> hm = new HashMap();
        
        for(int i = 0; i < order.length(); i ++){
            hm.put(order.charAt(i), i);
        }
        for(int i = 0; i < words.length - 1; i ++){
            int p = 0;
            int end = Math.min(words[i].length(), words[i+1].length());
            boolean same = true;
            while(p < end){
                if(hm.get(words[i].charAt(p)) > hm.get(words[i+1].charAt(p))){return false;}
                if(hm.get(words[i].charAt(p)) < hm.get(words[i+1].charAt(p))){same = false; break;}
                p ++;
            }
            if(words[i].length() > words[i+1].length() && same){return false;}
        }
        return true;
    }
}