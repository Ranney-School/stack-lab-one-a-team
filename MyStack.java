import java.util.Arrays;

public class MyStack<T> {
    private T[] data;
    private int top;  // index of next open spot

    @SuppressWarnings("unchecked")
    public MyStack(int capacity) {
        data = (T[]) new Object[capacity];
        top = 0;
    }

    public void push(T item) {
        if (top == data.length) {
            data = Arrays.copyOf(data, 2 * data.length);
        }
        data[top] = item;
        top++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack underflow: empty stack");
        }
        top--;
        T value = data[top];
        data[top] = null; // help GC and avoid loitering
        return value;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek: empty stack");
        }
        return data[top - 1];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }
}
