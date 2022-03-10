class Solution {
    public int getLucky(String s, int k) {
        String num="";
        for(int i=0; i<s.length(); i++){
            num = num + Integer.toString((int)(s.charAt(i)-96));
        }
        int n=0;
        for(int i=0; i<num.length(); i++){
            n=n+Character.getNumericValue(num.charAt(i));
        }
        k--;
        while(k!=0){
            int ans=0;
            while(n!=0){
                ans+=n%10;
                n/=10;
            }
            k--;
            n = ans;
        }
        return (int) n;
        
    }
}