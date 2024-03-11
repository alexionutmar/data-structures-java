package datastructures.queue;

public class Main {
    public static void main(String[] args) {

        Queue myQueue = new Queue(4);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();

        myQueue.enqueue(13);
        myQueue.enqueue(21);
        myQueue.enqueue(33);

        myQueue.dequeue();
        myQueue.dequeue();

        System.out.println("\nQueue:");
        myQueue.printQueue();

    }
}
