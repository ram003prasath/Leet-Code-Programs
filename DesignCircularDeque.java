class DesignCircularDeque {

    int Dq[];
    int size;
    int front;
    int rear;
    int capacity;

    public DesignCircularDeque(int k) {
        Dq = new int[k];
        size = 0;
        front = 0;
        rear = -1;
        capacity = k;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        Dq[front] = value;
        size++;
        if(rear == -1){
            rear = front;
        }
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        rear = (rear + 1) % capacity;
        Dq[rear] = value;
        size++;
        if(front == -1){
            front = rear;
        }
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        if(isEmpty()){
            front = 0;
            rear = -1;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
        if(isEmpty()){
            front = 0;
            rear = -1;
        }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return Dq[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return Dq[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}