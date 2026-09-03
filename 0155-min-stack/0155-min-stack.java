class MinStack {

    Deque<Integer> stack;
    Deque<Integer> minstack;
    public MinStack() {
        stack = new ArrayDeque<>();
        minstack = new ArrayDeque<>();
    }
    public void push(int value) {
        stack.push(value);
// we just need to maintain our minstack from the start when we pushing in orginal stack as well ,, minstack is just for constant time haha easy peasy
        if (minstack.isEmpty() || minstack.peek() >= value) {
            minstack.push(value);
        }
    }
    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }
    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minstack.peek();
    }
}
