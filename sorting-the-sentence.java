class Solution {
    public String sortSentence(String s) {
        TreeMap<Integer, String> t = new TreeMap<>();
        String words[] = s.split(" ");
        for(int i = 0 ; i<words.length ; i++) {
			int len = words[i].length();
			int num = Integer.parseInt(String.valueOf(words[i].charAt(len-1)));
			t.put(num , words[i].substring(0,len-1));
		}
        
        String ans ="";
        for(Map.Entry<Integer, String> e : t.entrySet()){
            ans+=e.getValue();
            ans+=" ";
        }
        return ans.substring(0,ans.length()-1);
        
    }
}