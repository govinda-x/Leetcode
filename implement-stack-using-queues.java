class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size>1){
            q.add(q.remove());
            size--;
        }
    }
    public int pop() {
        return q.remove();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.size()>0?false:true;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */