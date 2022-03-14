class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String res="";
        String[] p =path.split("/");
        for(int i=0;i<p.length;i++){
            if(!s.isEmpty()  && p[i].equals("..")) s.pop();
            else if(!p[i].equals("") && !p[i].equals(".") && !p[i].equals(".."))
                s.push(p[i]);
        }
        if(s.isEmpty()) return "/";
        while(!s.isEmpty()){
            res= "/" + s.pop() + res;
        }
        return res;
    }
}