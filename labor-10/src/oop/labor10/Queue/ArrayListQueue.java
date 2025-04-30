package oop.labor10.Queue;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListQueue implements IQueue{
    private ArrayList<Object> items;
    private final int CAPACITY;

    // constructor
    public ArrayListQueue(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.items = new ArrayList<>(CAPACITY);
    }

    // implementations of the IQueue interface
    @Override
    public boolean isEmpty() {
        // return items.size() == 0;
        return items.isEmpty();
    }

    @Override
    public void enQueue(Object obj) {
        if(isFull()){
            items.add(obj);
        }
    }

    @Override
    public boolean isFull() {
        return items.size() == CAPACITY;
    }

    @Override
    public void printQueue() {
        for(Object o : items){
            System.out.print(o + " ");
        }
    }

    @Override
    public Object deQueue() {
        if(isEmpty()){
            Object temp = items.getFirst();
            items.removeFirst();
            return temp;
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ArrayListQueue that = (ArrayListQueue) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }
}
