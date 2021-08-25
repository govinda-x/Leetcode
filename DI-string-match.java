class Solution {
    public int[] diStringMatch(String s) {
        int l =0, h= s.length();
        int[] ans = new int[s.length()+1];
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I') ans[i] = l++;
            else ans[i] = h--;
        }
        ans[s.length()] = l;
        return ans;
    }
}