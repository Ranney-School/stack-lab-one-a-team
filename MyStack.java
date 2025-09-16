public class MyStack<T> {
    private T[] data;
    private int top;  // index of next open spot

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        data = (T[]) new Object[capacity];
        top = 0;
    }

    public void push(T item) {
        // TODO
    }

    public T pop() {
        // TODO
    }

    public T peek() {
        // TODO
    }

    public boolean isEmpty() {
        // TODO
    }

    public int size() {
        // TODO
    }
}
