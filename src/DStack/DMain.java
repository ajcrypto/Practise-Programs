package DStack;

public class DMain {

    public static void main(String[] args) {

        DStack stack = new DStack();


        stack.push(12);
        stack.push(18);
        stack.push(25);
        stack.push(32);
        stack.push(50);
        stack.push(70);

        System.out.println("Popping");

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();




        System.out.println("Stack size "  +stack.size());




    }
}
