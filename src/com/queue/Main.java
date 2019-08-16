package com.queue;

public class Main {

    public static void main(String[] args) {

        Queue queue = new Queue();
        queue.enQueue(12);
        queue.enQueue(20);
        queue.enQueue(28);
        queue.enQueue(40);

        System.out.println("Dequed element: "+queue.deQueue());
        System.out.println("Dequed element: "+queue.deQueue());
        System.out.println("Dequed element: "+queue.deQueue());

        queue.display();

    }
}
