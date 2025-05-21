public class MyHashMap {
    private static class Node {
        final Object key;
        Object value;
        Node next;

        Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node[] buckets;
    private int size;

    public MyHashMap() {
        buckets = new Node[16];
        size = 0;
    }

    public void put(Object key, Object value) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        Node node = buckets[index];
        while (node != null) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        Node newNode = new Node(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
        size++;
    }

    public Object get(Object key) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        Node node = buckets[index];
        while (node != null) {
            if (node.key.equals(key)) return node.value;
            node = node.next;
        }
        return null;
    }

    public void remove(Object key) {
        int index = Math.abs(key.hashCode()) % buckets.length;
        Node prev = null;
        Node node = buckets[index];
        while (node != null) {
            if (node.key.equals(key)) {
                if (prev == null) buckets[index] = node.next;
                else prev.next = node.next;
                size--;
                return;
            }
            prev = node;
            node = node.next;
        }
    }

    public void clear() {
        buckets = new Node[16];
        size = 0;
    }

    public int size() {
        return size;
    }
}