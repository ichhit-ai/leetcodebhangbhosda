class MyCircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        arr = new int[k]; 
        front = -1;
        rear = -1;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        
        if (isEmpty()) {
            front = 0;
        }
        
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }
        
        front = (front + 1) % capacity;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return front == -1;
    }
    
    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}