package oop.labor10.Queue;

import java.util.ArrayList;

public class CircularQueue implements IQueue{
    private ArrayList<Object> items;
    private final int CAPACITY;
    private int rear;
    private int front;

    public CircularQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new ArrayList<>(CAPACITY);
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void printQueue() {
        if(isEmpty()){
            return;
        }
        int i = front;
        while(true){
            System.out.print(items.getFirst());
            if (i == rear) break;
            i = (i + 1) % CAPACITY;
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            return null;
        }
        Object temp = items.getFirst();
        if(front == rear){
            front = -1;
            rear = -1;
        }
        else{
            front = (front + 1) % CAPACITY;
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return front == -1;
    }

    @Override
    public boolean isFull() {
        return front == (rear + 1) % CAPACITY;
    }

    @Override
    public void enQueue(Object obj) {
        if(isFull()){
            return;
        }
        if(isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % CAPACITY;
        items.add(obj);
    }
}
