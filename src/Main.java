public class Main {
    public static void main(String[] args) {
       // ArrayList<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Mango");
//        fruits.add("Guawa");
//
//        for(String item: fruits){
//            System.out.print(item + ",");
//
//        }
//        System.out.println();
//        System.out.println(fruits.size());
//
//        fruits.remove(0);
//        System.out.println(fruits.size());
//        for(String item: fruits){
//            System.out.print(item + ",");
//
//        }
//        System.out.println();
//        fruits.set(2,"Avacados"); // index ekata replace wenawa
//        for(String item: fruits){
//            System.out.print(item + ",");
//
//        }
//        System.out.println();
//        fruits.add(1,"Guawa");
//        for(String item: fruits){
//            System.out.print(item + ",");
//
//        }
        /*
            //.........ArrayList........//

        FruitManager manager = new FruitManager();
        manager.addFruits("Apple");
        manager.addFruits("Mango");
        manager.addFruits("Banana");
        manager.addFruits("Orange");
        manager.addFruits("Grapes");
        manager.addFruitAt(7,"Papaya");

        manager.display();
        System.out.println(" ");

        manager.removeFruit(2);
        manager.display();
        System.out.println(" ");

        manager.replaceFruit(2,"Avacados");
        manager.display();
         */

/*
        //........LinkedList........//
        LinkedList list = new LinkedList();
        list.append(10);
        list.append(20);
        list.append(25);
        list.append(30);
        list.prepend(5);
        list.insertAfter(10,15);
        list.printList();
        list.findMiddle();
        list.reverse();
        list.findValue(20);
        list.printList();
        list.findMiddle();
        list.delete(5);
        list.printList();
        list.findMiddle();
*/

    //.............. Doubly Linked list............ //
    DoublyLinkedList dlist = new DoublyLinkedList();
    dlist.insertAtBeginning(1);
    dlist.insertAtEnd(10);
    dlist.insertAtEnd(20);
    dlist.insertAtBeginning(5);
    dlist.displayForward();
    dlist.delete(10);
    dlist.displayForward();
    dlist.displayBackword();

    }
}