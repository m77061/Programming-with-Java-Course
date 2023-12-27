public class CustomList {
    private static final int INITIAL_CAPACITY = 4;

    private int[] data;
    private int index;

    public CustomList() {
        this.data = new int[INITIAL_CAPACITY];
        this.index = 0;
    }

    public CustomList(int capacity) {
        if (capacity < INITIAL_CAPACITY) {
            throw new IllegalArgumentException();
        }

        this.data = new int[capacity];
        this.index = 0;
    }

    public int getLength() {
        return this.index;
    }

    public int getCapacity() {
        return this.data.length;
    }

    public boolean contains(int element) {
        for (int index = 0; index < this.getLength(); index++) {
            if (this.data[index] == element) {
                return true;
            }
        }

        return false;
    }

    public void add(int element) {
        if (this.data.length == this.index) {
            this.addCapacity();
        }

        this.data[this.index++] = element;
    }

    public int removeAt(int index) {
        if (!isValid(index)) {
            throw new IllegalArgumentException();
        }

        int removedElement = this.data[index];

        for (int i = index + 1; i <= this.index; i++) {
            this.data[i - 1] = this.data[i];
        }

        return removedElement;
    }

    public void insertAt(int element, int index) {
        if (!isValid(index)) {
            throw new IllegalArgumentException();
        }

        if (this.data.length == this.index) {
            this.addCapacity();
        }

        for (int i = this.index; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        this.data[index] = element;
        this.index++;
    }

    private boolean isValid(int index) {
        return 0 <= index && index < this.index;
    }

    private void addCapacity() {
        int[] newArray = new int[this.data.length * 2];

        for (int index = 0; index < this.data.length; index++) {
            newArray[index] = this.data[index];
        }

        this.data = newArray;
    }
}
