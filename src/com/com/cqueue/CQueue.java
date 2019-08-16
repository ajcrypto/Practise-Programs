package com.com.cqueue;

public class CQueue {

    int cQueue[] = new int[5];
    int front;
    int rear;
    int size;

// To make it real circular queue remove if else conditions from enQueue and deQueue.

    public int enQueue(int data){


        if (!isFull()) {
            cQueue[rear] = data;
            rear = (rear + 1) % 5;
            size = size + 1;
        }else {
            System.out.println("Queue is full");
        }
        return data;
    }


    public int deQueue(){

        int data = cQueue[front];

        if (!isEmpty()) {
            front = (front + 1) % 5;
            size = size - 1;
        }else {
            System.out.println("Queue is empty");
        }
        return data;
    }

    public int getSize(){

        return size;
    }

    public boolean isEmpty(){

        return getSize()==0;
    }

    public boolean isFull(){

        return getSize()==5;
    }

    public void display(){

        System.out.print("Elements: ");
        for (int i=0; i<getSize(); i++){
            System.out.print(" "+cQueue[(front+i)%5]);
        }

        System.out.println();

        for (int n: cQueue){
            System.out.print(n + " ");
        }

    }
}
