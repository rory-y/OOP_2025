package oop.labor10;
import oop.labor10.Queue.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        IQueue queue = new ArrayListQueue( 5 ); // new CircularQueue( 5 );
        Random rnd = new Random();
        for( int i=0; i<100; ++i ){
            int value = rnd.nextInt(100);
            if( value < 50 ){
                System.out.println("Add: " + i);
                queue.enQueue( i );
            } else{
                if( queue.isEmpty() ){
                    System.out.println("Cannot delete from an empty queue");
                } else {
                    int element = (Integer) queue.deQueue();
                    System.out.println("Deleted: " + element);
                }
            }
            queue.printQueue();
        }
    }
}
