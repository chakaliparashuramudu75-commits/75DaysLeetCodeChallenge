class MinStack {
    //MinStack mahi=new MinStack();
    Stack<Integer>virat;
    Stack<Integer>minstack;
    public MinStack() {
        virat=new Stack<>();
        minstack=new Stack<>();
    }
    public void push(int val) {
     virat.push(val);  
       if(minstack.isEmpty() || val<=minstack.peek()) minstack.push(val);
    }
    public void pop() {
      if(virat.peek().equals(minstack.peek()))
      {
        minstack.pop();
      }
      virat.pop();
    }
    
    public int top() {
        return virat.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */