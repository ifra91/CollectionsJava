package demo.List;

public class LinkedList {

    //First node is referred to as head node
    Node head;

    //Implementing the functions to add data in our Linked List
    public void insert(int data) {

        //creating node obj ref
        Node node = new Node();
        node.data = data;

        //by default its value is null assigning just for reading ease
        node.next = null;

        //for first node when node is pointing to null it will be head
        if(head == null) {
            head = node;
        } else {

            Node n = head;
            //traverse till node gets null
            while(n.next != null){
            //jump from one value to another till we get null
                n = n.next;
            }
            //if not null set value to node
            n.next = node;
        }

    }

    //to print list data traverse the list
    public void show() {
//initially we will start with head
        Node node = head;
        //travel using while loop
        while (node!=null){
            System.out.println(node.data);
            node= node.next;
        }

    }
}
