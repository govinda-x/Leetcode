class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> h1 = new HashMap<>();
        HashMap<String, Integer> h2 = new HashMap<>();
        for(String a : words1){
            if(!h1.containsKey(a)) h1.put(a,1);
            else h1.put(a, h1.get(a)+1);
        }
        for(String a : words2){
            if(!h2.containsKey(a)) h2.put(a,1);
            else h2.put(a, h2.get(a)+1);
        }
        int c=0;
        for(String a: words2){
            if(h1.containsKey(a) && h1.get(a)==1 && h2.get(a)==1) c++;
        }
        return c;
    }
}