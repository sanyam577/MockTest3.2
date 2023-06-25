import java.util.LinkedList;

public class MockTestQ2 {
    private LinkedList<Integer> list;

    public MockTestQ2() {
        list = new LinkedList<>();
    }

    public void enqueue(int value) {
        list.addLast(value);
        System.out.println("Enqueued element is: " + value);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty, so we can't dequeue element.");
            return -1;
        }

        int dequeuedElement = list.removeFirst();
        System.out.println("Dequeued element is: " + dequeuedElement);
        return dequeuedElement;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        MockTestQ2 queue = new MockTestQ2();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}



