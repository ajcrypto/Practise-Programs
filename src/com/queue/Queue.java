package com.queue;

public class Queue {

    int queue[] = new int[5];
    int front;
    int rear;
    int size;


    public int enQueue(int data){

        queue[rear] = data;
        rear++;
        size++;

        return data;
    }

    public int deQueue(){

        int data = queue[front];
        front++;
        size--;

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

        for (int i = 0; i< size; i++){
            System.out.println("Element: " +queue[front+i]);
        }
    }
}
