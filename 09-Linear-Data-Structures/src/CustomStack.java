import java.util.EmptyStackException;

public class CustomStack {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int index;

    public CustomStack() {
        this.data = new int[INITIAL_CAPACITY];
        this.index = 0;
    }

    public void push(int element) {
        if (this.data.length == this.index) {
            this.addCapacity();
        }

        this.data[this.index++] = element;
    }

    public int pop() {
        if (!isEmpty()) {
            this.index--;
            int lastElement = this.data[this.index];
            this.data[this.index] = 0;
            return lastElement;
        }

        throw new RuntimeException();
    }

    public int peek() {
        if (!isEmpty()) {
            return this.data[this.index - 1];
        }

        throw new RuntimeException();
    }

    public boolean isEmpty() {
        return this.index == 0;
    }

    private void addCapacity() {
        int[] newArray = new int[this.data.length * 2];

        for (int index = 0; index < this.data.length; index++) {
            newArray[index] = this.data[index];
        }

        this.data = newArray;
    }
}
