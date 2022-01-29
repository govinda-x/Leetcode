class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int [] s11 = new int[26];
        for(int i=0; i<s1.length(); i++) s11[s1.charAt(i)-'a']++;
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s22 = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                s22[s2.charAt(i + j) - 'a']++;
            }
            if (Arrays.equals(s11, s22))
                return true;
        }
        return false;
    }
}