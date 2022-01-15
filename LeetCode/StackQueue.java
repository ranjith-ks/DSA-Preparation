/*
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
Implement the MyStack class:
void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
Notes:
You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.
Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.
*/
/*
class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public MyStack() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        while(!q1.isEmpty())
            q2.offer(q1.poll());
        q1.offer(x);
    }

    public int pop() {
        int result = q1.poll();
        while(!q2.isEmpty())
            q1.offer(q2.poll());
        while(q1.size()>1)
            q2.offer(q1.poll());
        return result;
    }

    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
}
*/

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new ArrayDeque<>();
    }

    public void push(int x) {
        q.offer(x);
        for(int i=0;i<q.size()-1;i++)
            q.offer(q.poll());
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
