class Pair{
    char ch;
    int count;
    public Pair(char ch,int count){
        this.ch = ch;
        this.count = count;
    }
}

class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!stack.empty() && stack.peek().ch==s.charAt(i)){
                int freq = stack.peek().count;
                freq+=1;
                stack.peek().count=freq;
                if(freq==k){
                    stack.pop();
                }
            }
            else stack.push(new Pair(s.charAt(i),1));
        }

        String ans = "";
        while(!stack.empty()){
            int count = stack.peek().count;
            char temp = stack.pop().ch;
            for(int i=0;i<count;i++){
                ans=Character.toString(temp)+ans;
            }
        }
        return ans;
    }
}