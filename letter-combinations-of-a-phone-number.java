class Solution {
    
    List<String> ans = new ArrayList<>();
    String number_pad[] = {"0", "1" ,"abc" , "def", "ghi", "jkl", "mno", "pqrs", "tuv" , "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length() == 0) return ans;
        combination(digits, 0, "");
        return ans;
    }
    public void combination(String digits, int start, String current){
        if(start == digits.length()){
            ans.add(current);
            return;
        }
        String letter = number_pad[digits.charAt(start)-'0'];
        for(int i=0; i<letter.length(); i++){
            combination(digits, start+1, current + letter.charAt(i));
        }
    }
}