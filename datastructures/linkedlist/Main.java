package datastructures.linkedlist;
public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        System.out.println("\nRemoved item: " + myLinkedList.removeLast().value);
        System.out.println("\nRemoved item: " + myLinkedList.removeLast());

        myLinkedList.append(21);
        myLinkedList.append(22);
        myLinkedList.insert(1, 108);
        myLinkedList.append(111);

        System.out.println("\nLinked List:");
        myLinkedList.printList();

        myLinkedList.reverse();

        System.out.println("\nLinked List:");
        myLinkedList.printList();
        System.out.println("\nMiddle node: " + myLinkedList.findMiddleNode().value);
        System.out.println("\nThe length of my list: " + myLinkedList.getLen());

        myLinkedList.set(1, 44);

        System.out.println("\nItem at the index of 0: " + myLinkedList.get(0).value);
        System.out.println("\nItem at the index of 1: " + myLinkedList.get(1).value);
        System.out.println("\nItem at the index of 3: " + myLinkedList.get(2).value);

        myLinkedList.remove(2);

        System.out.println("\nRemoved first item: " + myLinkedList.removeFirst().value);
        System.out.println("\nRemoved first item: " + myLinkedList.removeFirst().value);
        System.out.println("\nRemoved first item: " + myLinkedList.removeFirst());


    }
}
