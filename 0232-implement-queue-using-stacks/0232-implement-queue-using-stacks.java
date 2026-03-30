class MyQueue {
    int arr[];
    int capacity,front,rear;
    public MyQueue() {
        capacity=1000;
        arr=new int[capacity];
        front=0;
        rear=-1;
    }
    public void push(int x) {
         arr[++rear]=x;
    }
    public int pop() {
        return arr[front++];
    }
    
    public int peek() {
        return arr[front];
    }
    
    public boolean empty() {
        return rear<front;
    }
}
/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */