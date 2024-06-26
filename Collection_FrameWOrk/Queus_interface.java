package Collection_FrameWOrk;

import java.util.LinkedList;
import java.util.Queue;

public class Queus_interface {
    public static void main(String[] args) {
        Queue q1 = new LinkedList<>();

        // boolean offer (E, e) -> Insert the specified element into the queue.
        q1.offer(1);
        q1.offer(3);
        q1.offer(8);
        q1.offer(89);

        // boolean add (E, e) -> insert the specified element into the queue. Returns true if 
        // the element was added successfully, or false if the queue is full.
        q1.add(34);
        q1.add(54);
        q1.add(645);
        q1.add(34);

        // poll Removes and return the element at the front of the queue. Returns null if the queue is empty.
        q1.poll();

        // Retrive but does not remove the element at the front of the queue. Throws an exceptopn if the quue is empty.
        q1.element();

        // peek retrive but doest not remove the element at the front of the queue . returns nul if the queue if empty
        q1.peek();
        
        System.out.println(q1);
    }
}
