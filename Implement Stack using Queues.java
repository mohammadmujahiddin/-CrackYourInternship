// 225. Implement Stack using Queues
// Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
// Implement the MyStack class:
// void push(int x) Pushes element x to the top of the stack.
// int pop() Removes the element on the top of the stack and returns it.
// int top() Returns the element on the top of the stack.
// boolean empty() Returns true if the stack is empty, false otherwise.
// Notes:
// You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
// Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.




class MyStack {
    Queue<Integer> Q1;
    Queue<Integer> Q2;
    int front;
    public MyStack() {
        this.Q1 = new LinkedList<>();
        this.Q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        Q1.offer(x);
        front = x;
    }
    
    public int pop() {
        while (Q1.size() > 1) {
            front = Q1.poll();
            Q2.offer(front);
        }
        int popped = Q1.poll();
        Queue<Integer> temp = Q1;
        Q1 = Q2;
        Q2 = temp;
        return popped;        
    }
    
    public int top() {
        return front;
    }
    
    public boolean empty() {
        return Q1.isEmpty();
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
