class Solution {
    public String convert(String s,int i){
        char ch=s.charAt(i);
        char temp[]=s.toCharArray();
        if(ch >='A' && ch <='Z')
            temp[i]=(char)((int)temp[i]+32);
        else if(ch>='a' && ch<='z')
            temp[i]=(char)((int)temp[i]-32);
        return new String(temp);
    }
    public void solve(String s,int i,List<String > ans){
        if(i==s.length()){
            ans.add(s);
            return;
        }
        char ch=s.charAt(i);
        if(ch >='0' && ch <='9')
            solve(s,i+1,ans);
        else{
            solve(convert(s,i),i+1,ans);
            solve(s,i+1,ans);
        }
    }
    
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        if(s.length()==0)
            return ans;
        solve(s,0,ans);
        return ans;
    }
}