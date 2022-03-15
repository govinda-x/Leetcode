class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();
        int open = 0;
        
        for(char i : s.toCharArray()){
            if(i == '('){
                stack.push(i);
                open++;
            }
            else if(i == ')'){
                if(open > 0){
                    stack.push(i);
                    open--;
                }
            }
            else stack.push(i);
        }
        
        while(!stack.isEmpty()){
            char c = stack.pop();
            if(c == '('){
                if(open > 0) open--;
                else res.append(c);
            }
            else res.append(c);
        }
        return res.reverse().toString();
    }
}