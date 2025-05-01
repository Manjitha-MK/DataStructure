public class LinkedList {
    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Method to add a node at the end
    public void append(int newData){
        Node newNode = new Node(newData);
        if(head == null){
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to add a node at the first
    public void prepend(int newData){
        Node newNode = new Node(newData);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void reverse(){
        Node prev = null;
        Node current = head;

        while(current != null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void insertAfter(int target, int value){
        Node current = this.head;

        while(current != null){
            if(current.data == target){
                Node newNode = new Node(value);
                newNode.next = current.next;
                current.next = newNode;
                return;
            }
            current = current.next;
        }
        System.out.println("Target value " + target + " not found in the list");
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

}
