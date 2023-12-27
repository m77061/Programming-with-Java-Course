public class CustomQueue {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int index;

    public CustomQueue() {
        this.data = new int[INITIAL_CAPACITY];
        this.index = 0;
    }

    public void enqueue(int element) {
        if (this.data.length == this.index) {
            this.addCapacity();
        }

        this.data[this.index++] = element;
    }

    public int dequeue() {
        if (!isEmpty()) {
            int firstElement = this.data[0];

            for (int index = this.index - 1; index > 0; index--) {
                this.data[index - 1] = this.data[index];
            }

            return firstElement;
        }

        throw new RuntimeException();
    }

    public int peek() {
        if (!isEmpty()) {
            return this.data[0];
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
