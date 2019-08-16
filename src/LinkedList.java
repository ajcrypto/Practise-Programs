public class LinkedList {

    Node head;

    public void insert(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }else{
            Node n = head;

            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }


    }

    public void insertAtStart(int data){

        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;

    }

    public void insertAt(int index, int data){

        Node node = new Node();
        node.data = data;
        node.next = null;




        if (index == 0){
            insertAtStart(data);

        }else {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    /*public void delete(int index){

        if (head == null){
            return;
        }

        Node n = head;

        if (index == 0){
            head = n.next;
        }

        for (int i =0; n!=null && i< index-1;i++){
            n= n.next;

            // If position is more than number of ndoes
            if (n == null || n.next == null )
                return;

            Node next = n.next.next;
            n.next= next;

        }

    }*/


    public void deleteAt(int index){

        if (index == 0){
            head = head.next;
        }else{

            Node n = head;
            Node n1;

            for (int i =0;i< index-1; i++){

                n = n.next;

            }
            n1 = n.next;
            n.next = n1.next;

            System.out.println("Deleted "+n1.data);
        }



    }

    public void display(){

        Node node = head;

        while (node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
