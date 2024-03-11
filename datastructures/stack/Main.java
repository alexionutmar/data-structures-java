package datastructures.stack;

public class Main {
    public static void main(String[] args) {

        Stack myStack = new Stack(4);
        myStack.push(13);
        myStack.push(22);

        myStack.pop();

        myStack.getTop();
        myStack.getHeight();

        System.out.println("\nStack:");
        myStack.printStack();
    }
}
