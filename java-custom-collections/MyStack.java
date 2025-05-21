public class MyStack {
    private Object[] data;
    private int size;

    public MyStack() {
        data = new Object[10];
        size = 0;
    }

    public void push(Object value) {
        ensureCapacity();
        data[size++] = value;
    }

    public Object peek() {
        if (size == 0) return null;
        return data[size - 1];
    }

    public Object pop() {
        if (size == 0) return null;
        Object value = data[--size];
        data[size] = null;
        return value;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        for (int i = index; i < size - 1; i++) data[i] = data[i + 1];
        data[--size] = null;
    }

    public void clear() {
        data = new Object[10];
        size = 0;
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size >= data.length) {
            Object[] newData = new Object[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
    }
}