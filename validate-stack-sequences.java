class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> s = new Stack<>();
        int n = pushed.length, i=0, k=0;
        while(i<n && k<n){
            if(!s.isEmpty() && popped[k] == s.peek()){
                s.pop();
                k++;
            }
            else{
                s.push(pushed[i]);
                i++;
            }
        }
        if(s.isEmpty()) return true;
        while(k<n && s.peek()==popped[k]){
            k++;
            s.pop();
        }
        if(s.isEmpty()) return true;
        return false;
        
    }
}