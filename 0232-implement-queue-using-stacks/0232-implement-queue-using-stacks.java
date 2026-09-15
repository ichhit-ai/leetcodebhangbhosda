class MyQueue {
    Deque<Integer> stack;
    Deque<Integer> stackhelp;

    public MyQueue() {
        stack = new ArrayDeque<>();
        stackhelp = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        if (stackhelp.isEmpty()) {
            while (!stack.isEmpty()) {
                stackhelp.push(stack.pop());
            }
        }

        return stackhelp.pop();
    }
    public int peek() {
        if (stackhelp.isEmpty()) {
            while (!stack.isEmpty()) {
                stackhelp.push(stack.pop());
            }
        }
        return stackhelp.peek();
    }
    public boolean empty() {
        return stack.isEmpty() && stackhelp.isEmpty();
    }
}
