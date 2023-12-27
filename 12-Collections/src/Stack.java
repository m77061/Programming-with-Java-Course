import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class Stack {
    private Queue<Integer> data;

    public Stack() {
        this.data = new LinkedList<Integer>();
    }

    public void push(int element) {
        this.data.add(element);
    }

    public int pop() {
        if (this.data.isEmpty()) {
            throw new EmptyStackException();
        }

        for (int index = 0; index < this.data.size() - 1; index++) {
            this.data.add(this.data.poll());
        }

        return this.data.poll();
    }
}
