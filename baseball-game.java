class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        for(String i : ops){
            if(i.equals("C")) s.pop();
            else if(i.equals("D")) s.push(2*s.peek());
            else if(i.equals("+")){
                int second = s.pop(), first=s.pop();
                s.push(first);
                s.push(second);
                s.push(first+second);
            }
            else s.push(Integer.parseInt(i));
        }
        int sum=0;
        while(!s.isEmpty()) sum+=s.pop();
        return sum;
   }
}