public class MyArrayList {
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = new Object[10];
        size = 0;
    }

    public void add(Object value) {
        ensureCapacity();
        data[size++] = value;
    }

    public Object get(int index) {
        checkBounds(index);
        return data[index];
    }

    public void remove(int index) {
        checkBounds(index);
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
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

    private void checkBounds(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }
}