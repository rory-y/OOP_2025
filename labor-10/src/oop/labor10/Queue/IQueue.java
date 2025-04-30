package oop.labor10.Queue;
// this is an INTERFACE
// it acts as a blueprint, making the merging of different
public interface IQueue {
    // function DECLARATIONS only
    // similar to C headers work
    boolean isEmpty();
    boolean isFull();
    void enQueue(Object obj);
    Object deQueue();
    void printQueue();

}
