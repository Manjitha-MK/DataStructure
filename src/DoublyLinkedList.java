public class DoublyLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertAtEnd(int newData){
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
        newNode.prev = last;

    }

    public void insertAtBeginning(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;

        if(head != null){
            head.prev = newNode;
        }

        head = newNode;
    }


    public void displayForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

}
