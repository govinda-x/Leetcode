class Solution {
    public String replaceDigits(String s) {
        
        char [] arr = s.toCharArray();
        for(int i=1; i<arr.length; i+=2){
            arr[i] = (char)(arr[i] + (arr[i-1] - '0'));
        }
        String ans = String.valueOf(arr);
        return ans;
        
    }
}