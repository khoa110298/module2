package bai11_generic_stack_queue.bai_tap;

import java.util.LinkedList;


public class TestQueue {
    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.enQueue(6);
        queue.enQueue(7);
//        System.out.println(queue.deQueue().data);
        System.out.println(queue.disPlay());
        System.out.println(queue.size);
    }
}
