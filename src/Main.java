public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.insert(16);
        linkedList.insert(25);
        linkedList.insert(32);

        linkedList.insertAtStart(15);
        linkedList.insertAt(2,17);
        linkedList.deleteAt(3);

        linkedList.display();

    }
}
