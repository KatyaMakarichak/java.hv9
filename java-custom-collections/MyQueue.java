public class MyQueue {
    private static class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void add(Object value) {
        Node newNode = new Node(value);
        if (tail != null) tail.next = newNode;
        tail = newNode;
        if (head == null) head = newNode;
        size++;
    }

    public Object peek() {
        if (head == null) return null;
        return head.value;
    }

    public Object poll() {
        if (head == null) return null;
        Object value = head.value;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return value;
    }

    public void clear() {
        head = tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }
}