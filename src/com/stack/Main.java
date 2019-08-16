package com.stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();

        stack.pop();
        stack.push(12);
        stack.push(18);
        stack.push(18);
        stack.push(18);
//        DStack.push(18);
//        DStack.push(18);



        System.out.println("Stack size "  +stack.size());
        System.out.println("Peeked element "  +stack.peek());
        System.out.println("Popped element "  +stack.pop());
        stack.display();
        System.out.println("Stack size "  +stack.size());



    }
}
