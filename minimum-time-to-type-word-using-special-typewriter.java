class Solution {
    public int minTimeToType(String word) {
        int ans = word.length(), pos =0;
        for(int i=0; i<word.length(); i++){
            int req_pos = ((int)(word.charAt(i))%97);
            pos = Math.abs(pos - req_pos);
            ans += Math.min(pos, 26-pos);
            pos = req_pos;
        }
        return ans;
    }
}