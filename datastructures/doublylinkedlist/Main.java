package datastructures.doublylinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);

        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();

        myDLL.append(13);

        System.out.println("\nDoubly Linked List:");
        myDLL.printList();

        System.out.println("\nRemoved last item: " + myDLL.removeLast().value);

        myDLL.prepend(15);
        myDLL.append(101);
        myDLL.append(44);
        myDLL.printList();

        System.out.println("Node at index of 3: " + myDLL.get(3).value);

        myDLL.set(3, 55);
        myDLL.insert(3, 2);
        myDLL.printList();


    }
}
