package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;


    public static class Node {
        int value;
        Node next;
        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value){
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        if (head == null) {
            System.out.println("Head: null");
        } else {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() {
        if (head == null) {
            System.out.println("Tail: null");
        } else {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public Node removeLast(){
        if(length == 0) return null;

        Node pre = head;
        Node temp = head;

        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        this.tail = pre;
        this.tail.next = null;
        this.length--;

        if(length == 0){
            tail = null;
            head = null;
        }

        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    public Node removeFirst(){
        if(length == 0) return null;

        Node temp = head;
        head = temp.next;
        temp.next = null;
        length--;

        if(length == 0){
            tail = null;
        }
        return temp;
    }

    public Node get(int index){
        if(length < 0 || index >= length) return null;

        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);

        if(temp != null){
            temp.value = value;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean insert(int index, int value){
        if(index < 0 || index > length) return false;

        if(length == 0){
           prepend(value);
           return true;
        }

        if(index == length){
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);

        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if(index < 0 || index >= length) return null;

        if(index == 0) return removeFirst();

        if(index == length -1) return removeLast();

        Node prev = get(index -1);
        Node temp = prev.next;

        prev.next = temp.next;
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse(){
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for(int i = 0; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public Node findMiddleNode(){
        if(head == null) return null;
        if(head.next == null) return head;

        int len = 1;
        Node temp = head;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }

       Node middle = head;
        int index = len / 2;

        for(int i = 0; i < index; i++){
            middle = middle.next;
        }

        return middle;
    }

    public boolean hasLoop(){
        if(head == null) return false;
        if(head.next == null) return false;

        Node fast = head;
        Node slow = head;

        while((fast != null ? fast.next.next : null) != null || slow.next != null){
            slow = slow.next;
            fast = fast != null ? fast.next.next : null;

            if(slow == fast) return true;
        }

        return false;
    }

    public Node findKthFromEnd(int k){
        Node slow = head;
        Node fast = head;

        for(int i = 0; i < k; i++){
            if (fast == null) {
                return null;
            }
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

}
