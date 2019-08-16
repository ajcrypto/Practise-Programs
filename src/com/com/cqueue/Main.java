package com.com.cqueue;

public class Main {
    public static void main(String[] args) {


        CQueue cQueue = new CQueue();

        cQueue.enQueue(13);
        cQueue.enQueue(20);
        cQueue.enQueue(28);
        cQueue.enQueue(40);
        cQueue.enQueue(60);
        cQueue.enQueue(100);
//        cQueue.enQueue(120);

//        System.out.println(cQueue.isEmpty());
//        System.out.print(cQueue.isFull());

//        cQueue.deQueue();
//        cQueue.deQueue();
//        cQueue.deQueue();


        cQueue.display();

    }
}
