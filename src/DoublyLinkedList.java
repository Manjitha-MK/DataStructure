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

    public void delete(int val){
        if(head == null){
            return;
        }
        if(head.data == val){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
            return;
        }
        Node curr = head;
        while(curr!= null){
            if(curr.data == val){
                if (curr.prev != null){
                    curr.prev.next = curr.next;
                }
                if (curr.next != null){
                    curr.next.prev = curr.prev;
                }
                return;
            }
            curr = curr.next;
        }
    }

    public void displayForward() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public void displayBackword(){
        Node curr = head;

        if (curr == null) return;

        while (curr.next != null){
            curr = curr.next;
        }

        while(curr!= null){
            System.out.print(curr.data + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

}
